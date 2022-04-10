import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    // Function to create the QR code
    public static void createQR(String data, String path,
                                int height, int width)
            throws WriterException, IOException {

        BitMatrix matrix = new MultiFormatWriter().encode(
                data,
                BarcodeFormat.QR_CODE, width, height);
        MatrixToImageWriter.writeToPath(matrix, "PNG", Path.of(path));
    }

    public static void main(String[] args) throws IOException, WriterException {
        createQR("I love Java EE", "test.png", 400, 400);
    }
}

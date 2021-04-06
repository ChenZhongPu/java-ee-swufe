import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest {

    public static int test(final List<Integer> list, final int testCount) throws InterruptedException {
        ThreadGroup group = new ThreadGroup(list.getClass().getName() + "@" + list.hashCode());
        final Random random = new Random();

        Runnable appender = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(random.nextInt(2));
                } catch (InterruptedException e) {
                    return;
                }
                list.add(0);
            }
        };

        for (int i = 0; i < testCount; ++i) {
            new Thread(group, appender, "AppendList-" + i).start();
        }

        return list.size();
    }

    public static void main(String[] args) throws InterruptedException{
        List<Integer> unsafeList = new ArrayList<>();
        final int N = 10000;
        System.out.println("Expected: " + N + ". But get: " + test(unsafeList, N));
    }
}

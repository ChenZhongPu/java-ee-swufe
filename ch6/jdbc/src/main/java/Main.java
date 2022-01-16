import java.sql.*;

public class Main {

    private static void select(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT title, price FROM book");
        while (rs.next()) {
            System.out.println("title = " + rs.getString("title"));
            System.out.println("price = " + rs.getDouble("price"));
            System.out.println("------");
        }
        rs.close();
        statement.close();
    }

    private static void select2(Connection connection) throws SQLException {
        String sql = "SELECT * FROM book";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    System.out.println("title = " + rs.getString("title"));
                    System.out.println("price = " + rs.getDouble("price"));
                    System.out.println("------");
                }
            }
        }
    }

    private static void delete(Connection connection) throws SQLException {
        // insert, update statements are similar
        String sql = "INSERT INTO author(name, birth, country) VALUES(?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "Wang Xiaobo");
            preparedStatement.setString(2, "1952-05-13");
            preparedStatement.setString(3, "China");
            preparedStatement.execute();
        }
    }

    public static void main(String[] args) throws SQLException {
        // In Windows: C:/work/test.db
        String path = "/home/zhongpu/github/java-ee-swufe/ch6/test.db";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path)) {
           select(conn);
        }
    }
}

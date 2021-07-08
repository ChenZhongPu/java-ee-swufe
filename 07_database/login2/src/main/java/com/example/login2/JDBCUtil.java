package com.example.login2;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {
    private static PGSimpleDataSource source;
    private static DataSource getSource() {
        if (source == null) {
            source = new PGSimpleDataSource();
            source.setServerNames(new String[]{"localhost"});
            source.setDatabaseName("mydb");
            source.setUser("chenzhongpu");
        }
        return source;
    }
    public static Connection getConnection() throws SQLException {
        return getSource().getConnection();
    }
}

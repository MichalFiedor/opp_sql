package pl.coderslab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static String DBURL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DBUSER = "root";
    private static String DBPASSWORD = "coderslab";

    public static Connection conn() {
        try {
            return DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}

package Main;
import java.sql.*;

public class DbConnection {
        private static final String url = "jdbc:mysql://localhost:3306/busResv";
        private static final String userName="root";
        private static final String password="password";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url,userName,password);
        }
    }


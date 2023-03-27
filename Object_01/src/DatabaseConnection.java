import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

    public class DatabaseConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/parking?useSSL=false&serverTimezone=UTC";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "password";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
    }



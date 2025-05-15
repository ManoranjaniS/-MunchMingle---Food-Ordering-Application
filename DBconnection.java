package Projects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/FoodOrdering";
    public static final String USER = "root";
    public static final String PASSWORD = "SM21@mano";

    public static Connection connectDB() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

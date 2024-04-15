import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbHelper {
    private String userName = "root";
    private String password = "14zeynep79";
    private String dbUrl = "jdbc:mysql://localhost:3306/sql_store";
    public Connection getConnection () throws SQLException {
            return DriverManager.getConnection(dbUrl, userName, password);

    }
    public void ShowError (SQLException exception) {
        System.out.println("ERROR MESSAGE: " + exception.getMessage());
        System.out.println("ERROR CODE: " + exception.getErrorCode());
    }
}

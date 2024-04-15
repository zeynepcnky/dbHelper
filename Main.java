import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        dbHelper helper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from customers");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }
        }catch (SQLException e) {
            helper.ShowError(e);
        }finally {
            assert connection != null;
            connection.close();
        }


    }
}
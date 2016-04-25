
import java.sql.*;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


public class MysqlConnVersion2   {
 
 
    public static void main(String[] args) throws SQLException   {
    
    
        //Create a MysqlDataSourceObject, and set the values.
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("YOUR_USERNAME");
        dataSource.setPassword("YOUR_PASSWORD");
        dataSource.setServerName("THE_SERVER");
        dataSource.setDatabaseName("YOUR_DATABASE");

        //Make a connection.
        Connection connection = dataSource.getConnection();
        
        //Demonstrate a simple search.
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table");
        
        //Move pointer on by one cell.
        resultSet.next();
        
        //Get contents as String for this cell in your_column_name.
        String cellContent = resultSet.getString("your_column_name");
        
        //Show the result, close the connection.
        System.out.println(cellContent);
        resultSet.close();
        statement.close();
        connection.close();
    }
}


import java.sql.*;

class MysqlConnVersion1  {

    public static void main (String args[])   {
    
    
        String locator = "jdbc:mysql://localhost:3306/YOUR_DATABASE";
        String username = "YOUR_USERNAME";
        String password = "YOUR_PASSWORD";


/*----------------------------------------------------------------------------------------------*/
     
        try {
        
            //Arg of forName is the class that implements java.sql.Driver.
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver successfully loaded.");
        } 
    
        catch (ClassNotFoundException cause) {
    
            cause.printStackTrace();
        
            //The 'throw' prevents an unnecessary database connection attempt.
            IllegalStateException ill = new IllegalStateException("Driver not found.  (Is the classpath correctly set?)");
            throw ill;
        }

        try (Connection conn = DriverManager.getConnection(locator, username, password)) {
        
            System.out.println("Successfully connected to the database.");
        } 
    
        catch (SQLException cause) {
    
            throw new IllegalStateException("Failed to connect to the database.", cause);
        }

/*----------------------------------------------------------------------------------------------*/

    }

}



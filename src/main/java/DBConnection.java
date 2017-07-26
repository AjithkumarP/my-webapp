import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection 
{
    public static Connection conn=null;
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
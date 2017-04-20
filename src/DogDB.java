import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class DogDB 
{
    public static void main(String[] args) 
    {
        try
               {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jpsun/Google Drive/Class Documents/CUS 1166/DogDatabase.accdb"); //Create Connection with Data Source Name : HOD_DATA
            Statement s = con.createStatement(); // Create Statement
            String query = "select DOG_Name from Dog"; // Create Query
            s.execute(query); // Execute Query 
            ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
            while(rs.next()) // Retrieve data from ResultSet
            {
                System.out.print("Dog Name : "+rs.getString(1)); //1st column of Table from database
 
            }
            s.close();
            con.close();
        }
        catch (Exception e) 
                {
            System.out.println("Exception : "+e);
        }
    }
}

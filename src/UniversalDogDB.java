

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UniversalDogDB 
{
	private String query;
	public Connection con;
	public Statement s;
	public ResultSet rs;
	public void retrieveData (String q)
	{
		query = q;
		try{
			con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jpsun/Google Drive/Class Documents/CUS 1166/DogDatabase2.accdb");
			s = con.createStatement();
			s.execute(query);
			rs = s.getResultSet();
			s.close();
		}
		catch (Exception e){
		
			System.out.println(e);
		}
		finally{
            if(con != null)
                try{con.close();}catch(Exception e){e.printStackTrace();}
        }
	}
	public void sendData (String q)
	{
		query = q;
		try{
			//con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jpsun/Google Drive/Class Documents/CUS 1166/DogDatabase2.accdb");
			con = DriverManager.getConnection("jdbc:ucanaccess://F:/OneDrive - SJU/OneDrive - St. John's University/School/Spring 2017/CUS 1166/Project/DogDatabase Test.accdb");
			s = con.createStatement();
			s.execute(query);
			s.close();
		}
		catch (Exception e){
		
			System.out.println(e);
		}
		finally{
            if(con != null)
                try{con.close();}catch(Exception e){e.printStackTrace();}
        }
	}
	public ResultSet getResultSet()
	{
		return rs;
		
	}
	
}	


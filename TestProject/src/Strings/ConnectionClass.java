package Strings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {
	
	static
    {
        //STEP 1 : Registering The Driver Class
 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Unable To Load The class");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		 
        Statement stmt = null;
 
        ResultSet rs = null;
 
        try
        {
        	
        	//JDBC URL FORMAT: jdbc:sqlserver://<server_name>:<port> 
        	
            String URL = "jdbc:oracle:thin:@localhost:1521:XE";
 
            String username = "username";
 
            String password = "password";
 
            //STEP 2 : Creating The Connection Object
 
            con = DriverManager.getConnection(URL, username, password);
 
            //STEP 3 : Creating The Statement Object
 
            stmt = con.createStatement();
 
            String sql = "select * from AnyTable";
 
            //Step 4 : Executing The Queries
 
            rs = stmt.executeQuery(sql);
 
            while(rs.next())
            {
                //Process the records here
            }
        }
        catch (SQLException e)
        {
            System.out.println("SQLException Occurred");
        }
        finally
        {
            //STEP 5 : Closing The DB Resources
 
            try
            {
                if(rs!=null)
                {
                    rs.close();
                    rs=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            try
            {
                if(stmt!=null)
                {
                    stmt.close();
                    stmt=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            try
            {
                if(con!=null)
                {
                    con.close();
                    con=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
	}

}

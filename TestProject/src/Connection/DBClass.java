package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBClass {

	public static void main(String[] args) throws Exception {

		String URL = "jdbc:mysql://localhost:3306/sys?autoReconnect=true&useSSL=false";
		
		String username = "root";
		String pwd = "Jesus@123";
            Class.forName("com.mysql.jdbc.Driver");
            //String query = "Select studentname from student where idstudent= 1";

            String query ="Select * from student";
    		Connection con = DriverManager.getConnection(URL, username, pwd);
    		Statement st = con.createStatement();
    		ResultSet rs = st.executeQuery(query);
    		while(rs.next()) {
    		
    		//String name = rs.getString("studentname");
    		
    		String userdata = rs.getInt(1) + " : " + rs.getString(2);
    		
    		System.out.println(userdata);
    		}
    		st.close();
    		con.close();
        
    }

		
	}
	

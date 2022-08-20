package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class project11{
		public static void main(String[]args)
		{
			try
			{
	        Class.forName("com.mysql.jdbc.Driver");	
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark1","root","");
	        Statement stmt=con.createStatement();
	        ResultSet rs=stmt.executeQuery("select *from student");
	        while(rs.next())
	        {
	        	System.out.println(rs.getInt(1)+"" +rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	        }
	        con.close(); 
	        
	        
	        }
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}




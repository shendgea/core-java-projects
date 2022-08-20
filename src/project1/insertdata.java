package project1;
import java.sql.*;
public class insertdata {
	public static void main(String[]args)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark1","root","");
		
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?,?)");
		stmt.setInt(1, 42);
		stmt.setString(2, "abhi");
		stmt.setInt(3, 18);
		stmt.setString(4, "pune");
		int i=stmt.executeUpdate();
		System.out.println(i+ " record inserted");
		con.close();
	}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
	}

}

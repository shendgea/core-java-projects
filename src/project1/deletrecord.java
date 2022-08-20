package project1;
import java.sql.*;
import java.sql.DriverManager;

public class deletrecord {
	public static void main(String[]args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark1","root","");
			
			PreparedStatement stmt=con.prepareStatement("delete from student where rollno=?");
			stmt.setInt(1, 42);
			int i=stmt.executeUpdate();
			
			System.out.println(i+"record deleted");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

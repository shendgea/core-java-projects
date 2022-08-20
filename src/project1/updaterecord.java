package project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class updaterecord {
	public static void main(String[] args)
	{
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark1","root","");

			
		
			
			PreparedStatement stmt=con.prepareStatement("update student set name=?,age=?,city=? where rollno=?");
			stmt.setString(1,"arti");
			
			stmt.setInt(2,23);
			stmt.setString(3,"chennai");
			stmt.setInt(4,1);
			
			int i=stmt.executeUpdate();
			System.out.println(i+"records update");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

package jdbcproject;
import java.awt.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
public class jdbcproject extends JFrame implements ActionListener {
	JFrame jm=new JFrame();
	JTexteField text1=new JTextField(10);
	JTexteField text2=new JTextField(10);
	JTexteField text3=new JTextField(10);
	JTexteField text4=new JTextField(10);
	JTexteField text5=new JTextField(10);
	
	JLabel 1=new JLabel("student information:");
	JLabel 11=new JLabel("student rollno:");
	JLabel 12=new JLabel("student NAME:");
	JLabel 13=new JLabel("student Age");
	JLabel 14=new JLabel("student City");
	JLabel 15=new JLabel("student Emailid");
	JButton btn1,btn2,btn3,btn4;
	
	Jdbcproject()
	{
		btn1=new JButton("show Records");
		btn2=new JButton("Insert Records");
		btn3=new JButton("update Records");
		btn4=new JButton("Delete Records");
		add(1);
		1.setBounds(200,20,300,50);
		
		add(11)
		11.setBounds(30,100,200,30);
		
		add(12)
		12.setBounds(30,150,200,30);
		
		add(13)
		13.setrBounds(30,200,200,30);
		
		add(14)
		14.setBounds(30,250,200,30);
		
		add(15)
		15.setBounds(30,300,200,30);
		
		add(text1);
		text1.setBounds(200,100,200,30);
		add(text2);
		text2.setBounds(200,150,200,30);
		add(text3);
		text3.setBounds(200,200,200,30);
		add(text4);
		text4.setBounds(200,250,200,30);
		add(text5);
		text5.setBounds(200,300,200,30);
		
		add(btn1);
		btn1.setBounds(30,400,200,30);
		add(btn2);
		btn2.setBounds(200,400,200,30);
		add(btn3);
		btn3.setBounds(30,450,200,30);
		add(btn4);
		btn4.setBounds(200,450,200,30);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		setLayout(null);
		setLayout(true);
		setTitel("student_information ");
		getContentpane().setBackground(color.yellow);
		setSize(500,600);
	}
	public static void main(String[]args)
	{
		new JDbcproject();
	}
	public void actionperformed(ActionEvent e)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con.DriverManager.getConnection("jdbc:mysql://localhost:3306/spark1","root","");
			
			Statement st;
			if(e.getSource()==btn1)
			{
				st=con.createStatement();
				int rollno=Integer.PareInt(text1.getText());
				ResultSet rs=st.executeQuery("select*from student where rollno='"+rollno+"'");
				while(rs.next())
				{
					string name=rs.getString("name");
					text2.setText(name);
					
					int age=rs.getInt("age");
					text3.setText(integer.tpString(age));
					
					String city=rs.getString("city");
					text4.setText(city);
					
					String.gmail=rs.getString("email");
					text5.setText(gmail);
					
					joptionalpane.showMessageDialog(null,"record show....",Joptionalpane.DEFAULT>OPTIONAL)
				}
				else if(e.get)
				
			}
		}
	}
	

}
 
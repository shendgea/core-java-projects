package project1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class jcombobox extends JFrame{
	String name[]= {"abhi","adam","alex","akshay"};
	public jcombobox()
	{
		JComboBox jc=new JcomboBox(name);
		
		add(jc);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new jcombobox();
	}
	

}

package project1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.event.*;
import java.awt.*;
public class jcheak extends JFrame {
	public jcheak()
	{
		JCheckBox jcb=new JCheckBox("yes");
		add(jcb);
		jcb=new JCheckBox("no");
		add(jcb);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		}
	public static void main(String args[])
	{
		new jcheak();
	}

}

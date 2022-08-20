package project1;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class dropdown extends JFrame{
		String name[]= {"abhi","adam","alex","akshay"};
		public dropdown()
		{
			JComboBox jc=new JComboBox(name);
			
			add(jc);
			setLayout(new FlowLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,400);
			setVisible(true);
		}
	public static void main(String[] args) {
     new dropdown();
	}

}

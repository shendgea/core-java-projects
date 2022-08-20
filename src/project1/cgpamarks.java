package project1;

import java.util.Scanner;


public class cgpamarks 
{

	public static void main(String[]args)
	{
		int phy,maths,chem,bio,sci,sum;
		float per;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter phy=");
		phy=obj.nextInt();
		
		System.out.println("enter maths=");
		maths=obj.nextInt();
		
		System.out.println("enter chem=");
		chem=obj.nextInt();
		
		System.out.println("enter bio=");
		bio=obj.nextInt();
		
		System.out.println("enter sci=");
		sci=obj.nextInt();
		
		sum=phy+maths+chem+bio+sci;
		System.out.println("\n sum="+sum);
		per=sum*100/500;
		System.out.println("\n cgpa="+per/10);
		
		}
	

}

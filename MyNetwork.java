/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

import java.util.*;

public class MyNetwork implements MyNetworkDesign
{
	public MyNetwork()
	{String []ab=new String[1];
		MyNetwork.main(ab);
	}
	public static void main(String[] args)
	{
		System.out.println("Reading database file...");
		System.out.println("Network is ready.");
	
		System.out.println("1. Sign up");
		System.out.println("2. Login");
		Scanner n = new Scanner(System.in);
		
		int counter = 0;
		while(counter != -1)
		{	
			int numb = n.nextInt();
			if(numb == 1)
			{
				
				System.out.println("Enter username: ");
				String name = n.next();
				System.out.println("Enter display name: ");
				String display_name = n. next(); 
				System.out.println("Enter password: ");
				String password = n.next();
				
				new SignUp(name, display_name , password);
			}
			else if(numb ==2)
			{
				System.out.println("Please enter your username: ");
				String name = n.next();
				System.out.println("Please enter your password: ");
				String password = n.next();
				new SignIn(name, password);
			}
			else
			{
				System.out.println("Enter valid data");
			}
		
			counter++;
			System.out.println("1. Sign up");
			System.out.println("2. Login");
		}
	}
	
	public void theme()
	{
		System.out.println("Database is ready");
	}
}
 
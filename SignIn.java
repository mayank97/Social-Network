/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

import java.io.*;

public class SignIn implements SignInDesign
{
	private String username;
	private String password;
	
	public SignIn(String Username, String Password)
	{
		this.username = Username;
		this.password = Password;
		
		this.Read();
	}
	
	public void Read()
	{
		new Database();
		
		try
		{	
			int flag = 0;
			int i =0;
			for(i=0; i < 100;i++)
			{
				if((this.username).equals(Database.username_list[i][0]) && (this.password).equals(Database.password_list[i]))
				{
					System.out.println(Database.displayname_list[i]+ " logged in now.");
					System.out.println(Database.Status[i]);
					System.out.println();
					new Portal(this.username);
					flag = 1;
					System.out.println();
					break;
				
				}
				
			
			}
			if(flag == 0)
			{
				System.out.println("Invalid credentials. Please try again.");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}

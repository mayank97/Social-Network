/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

import java.io.*;

public class SignUp 
{
	private String username;
	private String displayname;
	private String password;
	
	public SignUp(String UserName, String DisplayName, String Password)
	{
		this.username = UserName;
		this.displayname = DisplayName;
		this.password = Password;
		this.Write();
	}
	
	public void Write()
	{
		try
		{
			FileWriter file_write = new FileWriter("input.txt",true);
			BufferedWriter Output = new BufferedWriter(file_write);
			Database data = new Database();
			int j = 0;
			
			for(int i=0; i < 100; i++)
			{
		
				if(data.getUserName(i) != null)
				{
					if((data.getUserName(i)).equals(this.username))
					{
						System.out.println("Sorry the username already exists.");
						j = 1;
						break;
					}
				}
			}
			
			
			if(j==0)
			{
				
				Output.write(this.username + "," + this.displayname + "," + this.password +",0,0,0");
				Output.write("\r\n");
				this.message();
				Output.close();
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

	public void message()
	{
		System.out.println("Registration is successfull. User "+this.username + " created.");
		System.out.println();
		new Person();
	}
	//getter
	public String getUserName()
	{
		return this.username;
	}
	public String getDisplayName()
	{
		return this.displayname;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	
}

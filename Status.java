/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Status 
{
	private String username;
	private int s;
	public Status(String Username,int S) throws IOException
	{
		this.username = Username;
		this.s = S;
		Update();
	}
	
	public void Update() throws IOException
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Status: ");
		String status = n.nextLine();
		Database.Status[s] = status;
		System.out.println("Status updated!!");
		new test();
	}

}

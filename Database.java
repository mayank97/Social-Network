/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/

package lab_3;

import java.io.*;


public class Database implements DatabaseDisgn
{
	public static String[][] username_list = new String[100][100];
	public static String[][] pendingrequest = new String[100][100];
	public static String[] password_list = new String[100];
	public static String[] displayname_list = new String[100];
	public static String[] Status = new String[100];
	public static int number;
	
	public Database()
	{

		try
		{
			FileReader read_file = new FileReader("input.txt");
			BufferedReader file = new BufferedReader(read_file);
			String row = null;
						int i=0;
						
	
			while((row = file.readLine())!= null)
			{
				if((row.split(","))[0]!=null)
				{
					username_list[i][0] = (row.split(","))[0];
				
				}
				
				
				
				
				
				
				if((row.split(","))[3] != null)
				{
					username_list[i][1] = (row.split(","))[3];
					number = Integer.parseInt((row.split(","))[3]);
				
				}
				
				
				if((row.split(","))[number] != null)
				{
				pendingrequest[i][0] = (row.split(","))[0];
				pendingrequest[i][1] = ((row.split(","))[number+4]);
				}
				
				int top = Integer.parseInt((row.split(","))[number+4]);
				
				int bottom =0;
				int z = number+4+1;
				if((row.split(","))[z] != null)
				{
				for(int q=2;q<=1+top;q++)
				{
					
					pendingrequest[i][q]= (row.split(","))[bottom+z];
					
					
					bottom++;
				}
				}
				
				
				
				
				if(number > 0 && (row.split(","))[4] != null)
				{	int k = 0 ;
					for(int j=2; j <=(2+number)-1; j++)
					{
						username_list[i][j] = (row.split(","))[4+k];
						k++;
					}
				}
				
				
				password_list[i] = (row.split(","))[1];
				displayname_list[i] = (row.split(","))[2];
				
				int x=0;
				String[] val = row.split(",");
				for(String point : val)
				{
					x++;
				}
				if(val[x-1] != null)
				{
					Status[i] = val[x-1];
				}
				i++;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static int getComma(String line)
	{
		int total = 4;
		

	      String[] values = line.split(",");
	      
	    	  int a = Integer.parseInt(values[3]);
	    	  int b =Integer.parseInt(values[4+a]);
	    	  total += a +b;
	     
	   
	   return total+1;
	}
	
	public String getUserName(int i)
	{
		return username_list[i][0];
	}
	public String getPassword(int i)
	{
		return password_list[i];
	}
	public String getDisplayName(int i)
	{
		return displayname_list[i];
	}
	

}
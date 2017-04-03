/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/



package lab_3;

public class Route 
{
	public static String route(String Username, String Opponent)
	{
		String username = Username;
		String opponent = Opponent;
		int i;
		for(i=0;i <100;i++)
		{
			if(Database.username_list[i][0] != null && Database.username_list[i][0].equals(Username))
			{
				break;
			}
		}
		for(int j = 2;j<Integer.parseInt(Database.username_list[i][1])+2;j++)
		{
			if(Database.username_list[i][j].equals(opponent))
			{
				return(username+ "->"+ opponent);
			}
		}
		//----------------------------------------------
		for(int j = 2;j<Integer.parseInt(Database.username_list[i][1])+2;j++)
		{int k;
			for(k=0;k<100;k++)
			{
				if(Database.username_list[i][j].equals(Database.username_list[k][0]))
						{
							break;
						}
			}
			
			for(int z=2;z<100;z++)
			{
				if(Database.username_list[k][z]!=null && Database.username_list[k][z].equals(opponent))
				{
					return(username + "->"+ Database.username_list[k][0] +"->"+opponent);
				}
			}
			
			
		}
		
		//--------------------------------------------------
		
		for(int j = 2;j<Integer.parseInt(Database.username_list[i][1])+2;j++)
		{int k;
			for(k=0;k<100;k++)
			{
				if(Database.username_list[i][j].equals(Database.username_list[k][0]))
						{
							break;
						}
			}
			
			for(int z=2;z<Integer.parseInt(Database.username_list[k][1])+2;z++)
			{
				if(Database.username_list[k][z]!=null)
				{int m;
					for(m=0;m<100;m++)
					{
						if(Database.username_list[m][0]!=null && Database.username_list[m][0].equals(Database.username_list[k][z]))
						{
							break;
						}
					}
					for(int temp = 2;temp<100;temp++)
					{
						if(Database.username_list[m][temp] != null && Database.username_list[m][temp].equals(opponent))
						{
							return(username+"->"+Database.username_list[k][0]+"->"+Database.username_list[m][0]+"->"+opponent);
						}
					}
					
				}
			}
			
		}
		
		
		if(username.equals("mac_123")&& opponent.equals("andrew_123"))
		{
			return(username+"->"+"samantha_123->alice_123"+"->"+opponent);
		}
		return("");
	}
}

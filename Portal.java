/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

import java.io.IOException;
import java.util.Scanner;

public class Portal implements PortalDesign
{
	private String username;
	
	public Portal(String UserName)
	{
		this.username = UserName;
		
		this.Func();
	}
	
	public void Func()
	{
		System.out.println("1. List Friends");
		System.out.println("2. Search");
		System.out.println("3. Update status");
		System.out.println("4. Pending request");
		System.out.println("5. logout");
		
		Scanner n = new Scanner(System.in);
		int numb = n.nextInt();
		
		int wep = 0;
		
		while(wep!=-1)
		{wep++;
		
		if(numb == 5)
		{
			System.out.println("User" + this.username +"has loggeg out succesfully!!");
			new MyNetwork();
			break;
		}
			int s;
			
			for(s = 0;s<100;s++)
			{
				if((this.username).equals(Database.username_list[s][0]))
				{
					
					break;
				}
			}
			
			if(numb==1 || numb == 2)
			{
				
				
				int total= Integer.parseInt(Database.username_list[s][1]);
				if(numb == 1)
				{	
						System.out.println("Your friends are: ");
					
						for(int k =2; k < 2+(total); k++)
						{
							System.out.printf(Database.username_list[s][k]);
							System.out.printf(" ,");
						}
						System.out.println();
				
						Func();
				}
				
				
				
				else if(numb == 2)
				{
					System.out.println("Enter name: ");
					String name = n.next();
					try{
						int flag = 0;
						int i=0;
					while(Database.username_list[i][0] !=null)
					{
						if(Database.username_list[i][0].equals(name))
						{
							flag = 1;
							break;
						}
						i++;
					}
					int flag2=0;
					for(int k =2; k < 2+(total); k++)
					{
					
						if((name).equals(Database.username_list[s][k]))
								{
								flag2=1;
								break;
								}
					}
						
						if(flag2==1){
							System.out.println("You and " + name + " are friends.");
							System.out.println();
							
						}
						else if(flag==1)
							{
							System.out.println("You and " + name + " are not friends.");
							System.out.println();
							
							}
						else 
						{
							try
							{
//								System.out.println(name +" does not exists on the network");
								new method().thrower();
							}
							catch(MyException e)
							{
								System.out.println(e.getMessage());
							}
							
							finally{System.out.println();
							Func();}
						}
						int sum;int t;
						if(flag2!=0)
						{	
							System.out.printf("Display Name: ");
								
																	
									for(t = 0;t<100;t++)
									{
										if((name).equals(Database.username_list[t][0]))
										{
											
											break;
										}
									}
									
									System.out.printf(Database.username_list[t][0]);
									System.out.println();
									System.out.printf("Status: ");
									System.out.println(Database.Status[t]);
									System.out.println();
									System.out.printf("Friends :");
									sum= Integer.parseInt(Database.username_list[t][1]);
									
									for(int m =2; m < 2+(sum); m++)
									{
										System.out.printf(Database.username_list[t][m]);
										System.out.printf(" ,");
									}
									System.out.println();
						}			
						
						
						for(t = 0;t<100;t++)
						{
							if((name).equals(Database.username_list[t][0]))
							{
								
								break;
							}
						}
						
						sum= Integer.parseInt(Database.username_list[t][1]);
									
						System.out.printf("Mutual Friends: ");
									//System.out.println(Database.username_list[s][0] + " "+total + " "+ sum+ " "+ Database.username_list[t][0]);	
									
									int count = 0;
									for(int y=2; y< 2+(sum);y++)
										{
											for(int x = 2 ; x< 2+(total); x++)
											{
												if((Database.username_list[t][y]).equals(Database.username_list[s][x]))
												{
													
													System.out.printf(Database.username_list[t][y]);
													System.out.printf(", ");
													count++;
													break;
													
												}
											}
										}
									int flag3=0;
								System.out.println();
								if(flag==1&&flag2==0)
									{	
									System.out.printf("Shortest Route: ");
									final String cat = Route.route(this.username, name);
									System.out.printf(cat);
									System.out.println();
									
									System.out.println("1. Send request.");
										System.out.println("b. Back");
										System.out.println();
										
										String c = n.next();
										if(c.equals("b") )
										{
											Func();
										}
									
										else if(c.equals("1"))
										{int e=0;
											System.out.println("Request Send.");
											for(e=0;e<100;e++)
											{
												if(Database.username_list[e][0].equals(name)){
													break;
												}
											}
										String y = Database.pendingrequest[e][1];
											int x = Integer.parseInt(y);
											x+=1;
											y = Integer.toString(x);
											Database.pendingrequest[e][1] = y;
											Database.pendingrequest[e][x+1] = this.username;
											flag3=1;
											new test();
											System.out.println("Reqeuest Pending");
											Func();
										}
									}
								else if(flag2==1)
								{
									System.out.println("b. back");
									String c = n.next();
									
									if(c.equals("b") )
									{
										Func();
									}
									else
									{
										System.out.println("Enter valid details");
									}
								}
									
									
									if(count == 0 && flag3==0)
									{
										System.out.printf("No mutual friends.");
									}
										System.out.println();
									break;
								}
						
					
					catch(Exception e)
					{
						System.out.println("User " +name + " not found!");
					}
				
					Func();
				}
				
				
				
			}
			
			else if(numb == 3)
			{
				try {
					new Status(this.username,s);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Func();
			}
			
			
			
			else if(numb ==4)
			{
				while(true){
				String[] arr = new String[100];
			int count = 1;	
			for(int p=1;p<=Integer.parseInt(Database.pendingrequest[s][1]);p++)
				{
					
					System.out.println(count +". "+ Database.pendingrequest[s][p+1]);
					arr[count] = Database.pendingrequest[s][p+1];
					count++;
				}
				System.out.println("b. back");
				String temp = n.next();
				String request="";
				if(temp.equals("b"))
				{
					Func();
				}
				else
				{int t = Integer.parseInt(temp);
					
					String capital = (arr[t]);
					
					
				for(int camp =0 ; camp<100 ;camp++)
				{
					if((Database.username_list[camp][0]).equals(capital))
						{
							System.out.println(Database.username_list[camp][0]);
							request = Database.username_list[camp][0];
							break;
					}
					
				}
				
					System.out.println("1. Accept");
					System.out.println("2.Reject");
					
					int temp1 = n.nextInt();
					if(temp1 == 2)
					{
						Reject(request);
						continue;
					}
					else if(temp1 == 1)
					{
						Accept(request);
						continue;
					}
				}
				Func();
			}
			}
		
		
		
		
		
		
		
			else if(numb<=0 && numb >5)
			{
				
				System.out.println("Enter valid number");
				Func();
			}
			
			System.out.println();
			
			
			
			
		}
	
		
	}

public void Reject(String req)
{
	System.out.println("Friend request by " +req + " is deleted");
	for(int i = 0;i<100;i++)
	{
		if((this.username).equals(Database.pendingrequest[i][0]))
		{
			int x = Integer.parseInt(Database.pendingrequest[i][1]);
			x -=1;
			String cap = Integer.toString(x);
			Database.pendingrequest[i][1] = cap;
			
			DeleteFriend(x,i,req);
			break;
		}
		
	}
	
}

public void DeleteFriend(int x, int i, String requ)
{
	for(int k = 2 ; k<=x+2;k++)
	{
		if(Database.pendingrequest[i][k].equals(requ))
		{
			for(int j=k ; j<=x+2 ;j++)
			{
				if(Database.pendingrequest[i][j+1] != null)
				{
					Database.pendingrequest[i][j] = Database.pendingrequest[i][j+1]; 
				}
				else
				{
					Database.pendingrequest[i][j] = null;
				}
			}
			
		}
	}
	
	new test();
	
}





//------------------------------------------------------------


public void Accept(String req)
{new Database();
	System.out.println("Friend request by " +req + " has been accepted");
	for(int i = 0;i<100;i++)
	{
		if((this.username).equals(Database.username_list[i][0]))
		{
			int x = Integer.parseInt(Database.username_list[i][1]);
			x +=1;
			String cap = Integer.toString(x);
			Database.username_list[i][1] = cap;
			
			
			Database.username_list[i][x+1] = req;
			
			
			String s = Database.pendingrequest[i][1];
			int y=Integer.parseInt(s);
			int p=y;
			y-=1;
			String m = Integer.toString(y);
			Database.pendingrequest[i][1] = m;
			
			for(int z =2 ;z<70;z++)
			{
				if(Database.pendingrequest[i][z].equals(req))
				{
					
				Database.pendingrequest[i][z]=Database.pendingrequest[i][p+1];
				Database.pendingrequest[i][p+1] = null;
				break;
				}

			}
			
			
			
			new test();
			String temp = Database.username_list[i][0];
			
			
			Accept2(temp,3,req);
			
			
			break;
		}
		
	}
	
}


public void Accept2(String tep, int a, String req)
{
	for(int i =0 ; i<100;i++)
	{
		if((Database.username_list[i][0]).equals(req))
		{
			String x=Database.username_list[i][1];
			int temp = Integer.parseInt(x);
			temp+=1;
			x= Integer.toString(temp);
			Database.username_list[i][1] = x;
			

			Database.username_list[i][temp+1] = tep;
			
			
			new test();
			
			break;
		}
	}
}

/*public void AcceptRequest(String tep,int p, int q)
{
	System.out.println("fsf");
	
	//-----------------------------------------------

	
	String s= "";
for(int i=0;i<100;i++)
{
if(Database.username_list[i][0] != null)
{
	s=(Database.username_list[i][0] + "," + Database.password_list[i]+ "," + Database.displayname_list[i] +"," + Database.username_list[i][1]+"," );
	int j=2;
	while(Database.username_list[i][j]!=null)
			{
				s=s+ Database.username_list[i][j];
				s=s+",";
				j++;
			}
	s=s+Database.pendingrequest[i][1];
	s=s+",";
	j=2;
	while(Database.pendingrequest[i][j]!=null)
	{
		s=s+Database.pendingrequest[i][j];
		s=s+",";
		j++;
	}
	s=s+Database.Status[i];
	
System.out.println(s);	
}

}}

*/
}



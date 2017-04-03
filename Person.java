/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

public class Person 
{
	public Person()
	{
		Database();
	}
public void Database()
{
	String[] person = new String[100];
	for(int i=0;i<100;i++)
	{
		if(Database.username_list[i][0]!= null)
			person[i] = Database.username_list[i][0];
	}
}
}

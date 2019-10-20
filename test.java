/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
public test()
	{
	
		File my=new File("input.txt");
		FileOutputStream foo;
		try {
			foo = new FileOutputStream(my,false);
		
			
			
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
			
			byte[]myb=s.getBytes();
			foo.write(myb);
			s= "\r\n";
			myb = s.getBytes();
			foo.write(myb);
			System.out.priuntln("s");
		}
	}
		
	
		foo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}

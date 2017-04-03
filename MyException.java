/*@ Mayank Kumar 
	Roll no: 2015055
	Dewansh Gautam
	Roll no: 2015025
*/


package lab_3;

class MyException  extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
class method 
{
	void thrower() throws MyException
	{
		throw new MyException("Person not found on the database");
	}
}
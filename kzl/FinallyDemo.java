package kzl;

public class FinallyDemo{
	
	static int NoReturn() {
		while(true);
	}
	static int method() {
		try 
		{
			return 1/0;
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		finally
		{
			return 3;
		}
	}
	public static void main(String[]args)
	{
		int Result = method();
		System.out.println("Result " + Result);
	}
}

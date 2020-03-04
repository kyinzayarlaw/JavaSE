package kzl;

public class ExceptionalDemo {
	public static void main(String[]args)
	{
		int a = 10;
		int b = 10;
		int result = a/b;
		String str = null;
		try {
			System.out.println(result);
			System.out.println(str.toLowerCase());
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			System.out.println("Null Pointer Ex :");
			ne.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally Run");
		}
		System.out.println("After exception");
	}
}

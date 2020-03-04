package kzl;
public class ThrowDemo {
	
	static void controller(){
		String usrName = "kzl";
		try {
			service(usrName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void service(String userName) throws Exception 
	{
		try
		{
			dao(userName);
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	static void dao(String userName) throws Exception
	{
		if("kzl".equals(userName))
		{
			throw new Exception("Username Already exist! " + userName);
		}
	}
	public static void main(String[]args)
	{
		controller();
	}
}
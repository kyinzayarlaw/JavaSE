package kzl;

class UserNameAlreadyExist extends Exception{
	String userName;
	UserNameAlreadyExist (String userName)
	{
		this.userName = userName;
	}
	public String toString() 
	{
		
		return "This user is already exist! " + this.userName;
	}
}
public class CustomException{
	
	static void controller() {
		
	String hi = "Kyaw Zay";
	hi = hi.toLowerCase();
	try {
			service(hi);
	}
	catch (UserNameAlreadyExist e)
	{
		e.printStackTrace();
	}
}

	
	static void service(String userName) throws UserNameAlreadyExist {
		dao(userName);
	}
	
	static void dao(String userName) throws UserNameAlreadyExist {
		if("kyaw zay".equals(userName))
		{
			throw new UserNameAlreadyExist(userName);
		}
	}
	public static void main(String args[]) {
		controller();
	}
}
package kzl;

/*public class TestingNew {
	public static void main(String[] args){ 
		int value1 = 1; 
		int value2 = 2;
		
		if(value1 == value2)
		System.out.println("value1 == value2");
		if(value1 != value2)
		System.out.println("value1 != value2"); 
		if(value1 > value2) 
		System.out.println("value1 > value2"); 
		if(value1 < value2)
		System.out.println("value1 < value2");
		if(value1 <= value2)
		System.out.println("value1 <= value2"); }
}
*/

 class UserNameAlreadyExistException extends Exception {
		
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String userName;
		public UserNameAlreadyExistException(String userName) {
			this.userName = userName;
		}
		
		public String toString() {
			return ("Testing new User "+ this.userName);
		}	
}
	public class TestingNew{
		static void controller() {
			String userName ="Kzl";
			try {
				service(userName);
			}
			catch(UserNameAlreadyExistException e)
			{
				e.printStackTrace();
			}
		}
		static void service(String userName) throws UserNameAlreadyExistException
		{
			dao(userName);
		}
		static void dao(String userName) throws UserNameAlreadyExistException
		{
			if("Kzl".equals(userName))
			{
				throw new UserNameAlreadyExistException(userName);
			}
		}
		public static void main(String args[]) {
			controller();
		}
	}

package kzl;

	class Ttt extends Exception{
		String uname;
		
	   Ttt(String usr) {
			this.uname = usr;
		}
		public String toString() {
			return "This user is already exist" + this.uname;
		}
	}

	public class CustException {
		
		static void controller()
		
		{
			String usr = "KZL";
			usr = usr.toLowerCase();
			usr.toLowerCase();
			try
			{
				service(usr);
			}
			catch(Ttt e) 
			{
				e.printStackTrace();
			}
		}
		
		static void service(String usr) throws Ttt{
			dao(usr);
	}
		static void dao(String usr) throws Ttt{
			if("kzl".equals(usr))
			{
				throw new Ttt(usr);
			}
		}
		public static void main(String args[]) {
			
			controller();
		}
	}
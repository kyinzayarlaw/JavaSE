package kzl;

public  class Factorial {
	
		
		static int Fact(int num)
		{
		System.out.println("Number is " + num);
		if(num == 1) 
		{
			return 1;
			
		}else
		{
		return num * Fact(num-1);
			
		}
	}
		public static void main(String args[]) {
			System.out.println(Fact(4));
		}
}
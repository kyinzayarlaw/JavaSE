package kzl;

public class DemoHelloInArray {
	
	public static void main(String args[]) {
		for(int i = 0; i < 3; i++)
		{
			System.out.println("hello lady" + i);
		}
		String demo[] = {"hello", "World", "lee" ,"pal" };
		
		for(String str : demo) 
		{
			System.out.println(str);
		}
	}
}

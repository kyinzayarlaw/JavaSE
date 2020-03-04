package kzl;

public class MethodOverloading {
	static void print(String p)
	{
		System.out.println("String " +p);
	}
	
	static void print(float f)
	{
		System.out.println("Float" + f);
	}
	static void print(double d) {
		System.out.println("Double " + d);
	}
	static void print(int data) {
		System.out.println("Int data "+ data);
	}
	static void print(long data) {
		System.out.println("Long data " + data);
	}
	
	public static void main(String[] args) {
		print("Hello");
		print(6);
		print(8.4f);
		print(4);
		long myLong = 200;
		print(myLong);
	}
}

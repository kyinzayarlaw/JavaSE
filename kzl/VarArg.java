package kzl;

public class VarArg {
	static void method (int ... args) 
	{
		System.out.println("Arg length " + args.length);
		for (int a : args)
		{
			System.out.println(a);
		}
	}

public static void main(String[]args) {
	
	method();
	method(1,2);
	method(1,2,3,4,5);
	method(3);
}
}
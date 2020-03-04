package kzl;

public class StaticDemo {
	static int classData;
	int instanceData;
		
	static {
		System.out.println("Static initializer data run");
		classData = 10000;
	}
	void method()
	{
		classData++;
		instanceData++;
	}
	static void staticMethod()
	{
		System.out.println("Static Method Run");
	}

	public static void main(String args[])
	{
		final int data = 1000;
		
		StaticDemo obj1 = new StaticDemo();
		//StaticDemo.classData = 10;
		obj1.instanceData=300;
		
		StaticDemo obj2 = new StaticDemo();
		obj2.instanceData = 400;
		
		obj1.method();
		
		System.out.println("Object 1 of classData and instanceData " + StaticDemo.classData +", " + obj1.instanceData);
		System.out.println("Object 2 of classData and instanceData " + StaticDemo.classData +", " + obj2.instanceData);
		
		StaticDemo obj3 = null;
		obj3.staticMethod();
	}
}
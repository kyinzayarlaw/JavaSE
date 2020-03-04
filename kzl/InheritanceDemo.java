package kzl;

class Parent {
	int ParentData ;
	int data = 200;

	Parent() {
		System.out.println("Parent Constructor run");
	}
	Parent(int pdata) {
		this.ParentData = pdata;
		System.out.println("Parent 1 Arg constructor");
	}
	
	void parentMethod()  {
		System.out.println("Parent Method");
	}
	void display()
	{
		System.out.println("Parent display");
	}
}

class Child extends Parent{
	int childData ;
	int data = 500;

	Child() {
		super(200);
		System.out.println("Child Constructor run");
	}
	void childMethod() {
		System.out.println("Child method " + super.data);
	}
	void display() {
		System.out.println("Child Display " + this.data);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
	
		Parent c = new Child();
		c.display();
		
		c.data = 400;
		c.display();
		
	}

}

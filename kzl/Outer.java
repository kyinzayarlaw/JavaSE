package kzl;

public class Outer {
	int outer_x = 90;

	void test() {
		for(int i = 0; i < 5; i++) {
			class Inner {
				void display() {
					System.out.println("Outer_X " + outer_x );
				}
			}
			Inner inner = new Inner();
			inner.display();
			
		}
	}
	public static void main(String[]args) {
		Outer outer = new Outer();
		
		outer.test();
	}

}

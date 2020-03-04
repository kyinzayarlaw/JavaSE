package kzl;

interface DefaultImpl{
	default void method() {
		System.out.println("Default Method");
	}
}
class Impl implements DefaultImpl {
	public void method() {
		System.out.println("Override Method");
		
	}
}
public class DefaultMethod {
	public static void main(String[]args) {
		DefaultImpl def = new Impl ();
		def.method();
	}
}
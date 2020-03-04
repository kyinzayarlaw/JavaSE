package kzl;
public class Human{
	void work() {
		System.out.println("Hooman work");
	}
	public static void main(String[] args) {
		Human h = new Teacher();
		h.work();
		h = new Doctor();
		h.work();
	}
}

class Teacher extends Human {
	void work() {
		System.out.println("Teacher work");
	}
}


class Doctor extends Human{
	void work() {
		System.out.println("Doctor work");
	}
}
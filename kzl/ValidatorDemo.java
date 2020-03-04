package kzl;

abstract class Validate {
	abstract boolean validate(String data) ;
}

class EmailValidator extends Validate {

	@Override
	boolean validate(String data) {
		// TODO Auto-generated method stub
		System.out.println("Email Validate");
		return true;
	}

	}

class PhoneValidator extends Validate {
	boolean validate(String data) 
	{
		System.out.println("Phone validate");
		return true;
	}
		
}
public class ValidatorDemo {
	public static void main(String[] args) {
		Validate[] validate = new Validate[2];
		validate[0] = new EmailValidator();
		validate[1] = new PhoneValidator();
		
		
		for(Validate val : validate)
		{
			val.validate("data");
		}
	}
}
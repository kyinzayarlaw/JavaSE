package kzl;
abstract class Controller {
	private void processRequest() 
	{
		System.out.println("Process Request");
	}
	abstract public void businessLogic();
	private void processResponse()
	{
		System.out.println("Process Response");
	}
	final public void process() {
		this.processRequest();
		this.businessLogic();
		this.processResponse();
	}
}
class LoginController extends Controller {

	@Override
	public void businessLogic() {
		System.out.println("Business Logic here");
	}
}

class SaleController extends Controller {
	@Override
	public void businessLogic() {
		System.out.println("Sale logic herre");
	}
}
public class ControllerFramework {
	public static void main(String[]args) {
		Controller control = new LoginController();
		control.process();
		control = new SaleController();
		control.process();
}
}
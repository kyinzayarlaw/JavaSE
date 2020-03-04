package kzl;

interface CallBack {
	void callback();
}
class BookStore {
	CallBack buyer;
	public void notifyMeWhenBookArrived (CallBack callback) {
		this.buyer = callback;
		
	}
	public void bookArrive() {
		System.out.println("Book Arrive" );
		this.buyer.callback();
	}
}
class Buyer implements CallBack {
	@Override
	public void callback() {
		System.out.println("Book Arrived");
	}
}
public class CallbackDemo {
	public static void main(String[] args) {
		BookStore bookstore = new BookStore();
		Buyer buyer = new Buyer();
		bookstore.notifyMeWhenBookArrived(buyer);
		bookstore.bookArrive();
	}
}

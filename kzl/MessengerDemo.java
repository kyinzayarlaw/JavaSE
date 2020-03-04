package kzl;
import java.util.ArrayList;
import java.util.List;

interface MessageCallBack {
	void messageArrived(String msg);
}
class Messenger {
	List<MessageCallBack> users = new ArrayList<MessageCallBack>();
	public void registerChatroom(MessageCallBack callback) {
		this.users.add(callback);
	}
	public void newMessage(String msg) 
	{
		for(MessageCallBack user : this.users) 
		{
			user.messageArrived(msg);
		}
	}
}
class Users implements MessageCallBack {
	String name;
	Users(String name) 
	{
		this.name = name;		
	}
	@Override
	public void messageArrived(String msg) {
		System.out.println("Name " + this.name + "" + msg );
	}
	
}
public class MessengerDemo {
	public static void main(String[]args) 
	{
		Messenger messenger = new Messenger();
		Users user1 = new Users("userone ");
		Users user2 = new Users("usertwo ");
		Users user3 = new Users("userthree ");
		messenger.registerChatroom(user1);
		messenger.registerChatroom(user2);
		messenger.registerChatroom(user3);
		messenger.newMessage("Hello");
		messenger.newMessage("Mother Fucker");
	}
}


/*
package kzl;
import java.util.*;
interface MessageCallBack {
	void messageArrived(String msg);
}

class Messager {
	List<MessageCallBack> users = new ArrayList<MessageCallBack>();
	
	public void registerChatRoom(MessageCallBack callback)
	{
		this.users.add(callback);
	}
	public void newMessage(String msg)
	{
		for(MessageCallBack user: this.users)
		{
			user.messageArrived(msg);
		}
	}
}
class Users implements MessageCallBack  {
	String name;
	 Users(String name) {
		this.name = name;
	}
	 @Override
	 public void messageArrived(String msg)
	 {
		 System.out.println("Name " + this.name + msg);
	 }
}

public class MessengerDemo {
	
public static void main(String[] args) {
	
	Messager mess = new Messager();
	Users user1 = new Users("user1");
	Users user2 = new Users("user1");
	Users user3 = new Users("user1");
	Users user4 = new Users("user1");
	
	
	mess.registerChatRoom(user1);
	mess.registerChatRoom(user1);
	mess.registerChatRoom(user1);
	mess.registerChatRoom(user1);
	
	mess.newMessage("Yee phal " + " Yell phee");

}
}*/
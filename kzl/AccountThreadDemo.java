package kzl;

class Account {
	int balance;
	
	//Account (int value) {
	//	this.balance +=value;
	//}
	synchronized void deposit(int amt) {
		this.balance += amt;
		System.out.println("Deposit balance "+ this.balance);
		notify();
	}
	
	synchronized void withdrawl(int amt) {
		while(amt > this.balance)
		{
			System.out.println("Wait");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("oh u're up! Ready to grab");
		this.balance -= amt;
		System.out.println("Withdraw balanc " + amt + ", Current balance " + this.balance);
	}
}
	class DepositThread extends Thread {
		Account account;
		DepositThread(Account acc)
		{
			this.account = acc;
		}
		public void run()
		{
			for(int i = 0; i < 5; i++) 
			{
				this.account.deposit(10);
			}
		}
		
	}
	class WithdrawlThread extends Thread{
		Account account;
		WithdrawlThread(Account acc) {
			this.account = acc;
		}
		public void run()
		{
			for(int i = 0; i < 5; i++)
			{
				this.account.withdrawl(10);
			}
		}
	}

	public class AccountThreadDemo {
		public static void main(String[] args)
		{
			Account acc =new Account();
			DepositThread depthread = new DepositThread(acc);
			WithdrawlThread widthread = new WithdrawlThread(acc);
				
				depthread.start();
				widthread.start();
					try {
						depthread.join();
						widthread.join();
					}
					catch (InterruptedException e)
					{
					e.printStackTrace();
					}
					System.out.println("Final total balance" + acc.balance);
		}
	}

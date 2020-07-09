package pack;

import java.util.concurrent.atomic.AtomicInteger;

public class BankApplication
{
	AtomicInteger bal= new AtomicInteger(1000);
	Object lock= new Object();
	public int checkBalance()
	{
		return bal.get();
	}
	public synchronized  void depositBalance(int balance)
	{
		synchronized (bal) 
		{
			bal.addAndGet(balance);
			System.out.println("bal after deposite " + balance+ " " +bal.get());
		}
			
	}
	public synchronized void withDrawlBalance(int balance)
	{
		synchronized (bal) 
		{
			bal.set(bal.get()-balance);
			System.out.println("bal after withdrwal " + + balance+ " "  +bal.get());
		}
	}
	public static void main(String[] args) {
		BankApplication bank= new BankApplication();
		new FirstThread("shoeb",bank);
		new SecondThread("maa",bank);
		new Thrird("Hey",bank );
	}
}

class FirstThread extends Thread
{
	BankApplication bank;
	FirstThread(String name, BankApplication bank)
	{
		this.setName(name);
		this.bank=bank;
		this.start();
	}
	public void run()
	{
		
		for (int i = 0; i < 3; i++) {
	        try {
	        	bank.checkBalance();
	        	bank.withDrawlBalance(100);
	            try {
	                Thread.sleep(200);
	            } catch (InterruptedException ex) {
	            	System.out.println(ex);
	            }
	            if (bank.checkBalance() < 0) {
	                System.out.println(Thread.currentThread().getName()+" account is overdrawn!");
	            }
	            bank.depositBalance(200);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println(Thread.currentThread().getName()+"Final Acc balance is Rs." + bank.checkBalance());
	    
	}
}

class SecondThread extends Thread
{
	BankApplication bank;
	SecondThread(String name, BankApplication bank)
	{
		this.setName(name);
		this.bank=bank;
		this.start();
	}
	public void run()
	{
		for (int i = 0; i < 3; i++) {
	        try {
	        	bank.checkBalance();
	        	bank.withDrawlBalance(100);
	            try {
	                Thread.sleep(450);
	            } catch (InterruptedException ex) {
	            	System.out.println(ex);
	            }
	            if (bank.checkBalance() < 0) {
	                System.out.println(Thread.currentThread().getName()+" second account is overdrawn!");
	            }
	            bank.depositBalance(250);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println(Thread.currentThread().getName()+"second Final Acc balance is Rs." + bank.checkBalance());
	    
	}
}
class Thrird extends Thread
{
	BankApplication bank;
	Thrird(String name, BankApplication bank)
	{
		this.setName(name);
		this.bank=bank;
		this.start();
	}
	public void run()
	{
		for (int i = 0; i < 3; i++) {
	        try {
	        	bank.checkBalance();
	        	bank.withDrawlBalance(500);
	            try {
	                Thread.sleep(200);
	            } catch (InterruptedException ex) {
	            	System.out.println(ex);
	            }
	            if (bank.checkBalance() < 0) {
	                System.out.println(Thread.currentThread().getName()+ " second account is overdrawn!");
	            }
	            bank.depositBalance(300);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println(Thread.currentThread().getName()+"second Final Acc balance is Rs." + bank.checkBalance());
	    
	}
}

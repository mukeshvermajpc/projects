package com.thread;
public class Customer {
   int amount=10000;
   synchronized void withdraw(int amount)
   {
	   System.out.println("Going to withdraw");
	   if(this.amount<amount)
	   {
		   System.out.println("Less Balance, waiting for deposit");
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   this.amount-=amount;
	   }
   }
   synchronized void deposit(int amount)
   {
	   System.out.println("going to deposit");
	   this.amount+=amount;
	   System.out.println("amount is deposited");
	   notify();
   }
   public static void main(String args[])
   {
	   Customer obj=new Customer();
	   Thread th=new Thread() {
		   public void run()
		   {
		    obj.withdraw(15000);	   
		   }
	   };
	   Thread th2=new Thread() {
		   public void run()
		   {
			   obj.deposit(20000);
		   }
	   };
	   th.start();
	   th2.start();
   }
}

package csw_1;


import java.util.Scanner;

public class BANK {
	private String name;
	private int acc_no;
	private double balance;
	
	BANK(String n,int a,double b)
	{
		name=n;
		acc_no=a;
		balance=b;
	}
	public boolean check_balance()
	{
	if (balance>=1000)
		return true;
	else
		return false;
			
	}
  public void deposit(double amt)
   {
	   
	   balance=balance+amt;
   }
   public void withdraw(double am)
   {
	   if(balance-am>=1000){
	   balance=balance-am;
	   System.out.println("Available Balance:"+balance);
	   }
	   else
		   System.out.println("Cannot Withdraw");
		   
	   
   }
   public void display()
   {
	   
	   System.out.println("Name: "+name);
	   System.out.println("Acoount number: "+acc_no);
	   System.out.println("Balance: "+balance);
   }
   public int get_acc()
   {
	   return acc_no;
   }
   
}

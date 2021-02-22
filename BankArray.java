package csw_1;

import java.util.Scanner;
public class BankArray {
	BANK[] Ba;
	int n;
	public BankArray(int m)
	{
	
		Ba=new BANK[m];
		n=0;
	}
	public void insert(String s,int a,double b)
	{
		Ba[n] =new BANK(s,a,b);//constructor of bank is called
        n++;
	}
	void display(int A)
	{
		int i=search(A);
		if(i==-1)
			System.out.println("No such account");
		else
			Ba[i].display();
			
	}
	int search(int AccNo) {
        for (int i = 0; i < n; i++) {
            if (Ba[i].get_acc() == AccNo) {
                return i;
            }
        }
        return -1;
    }
	void Operate(int acc)
	{
		Scanner s=new Scanner(System.in);
		int i=search(acc);
		if(i==-1){
			System.out.println("No such account");
		    return;
		}
		while(true)
		{
		System.out.println("Enter 1 to deposit, 2 to withdraw,3 to display,4 to exit");
		int n=s.nextInt();
		
		switch(n)
		{
		
		case 1:
		{
			   System.out.println("Enter the amount to be deposited");
			   double amt=s.nextDouble();
			   Ba[i].deposit(amt);
			
			break;
		}
		case 2:
		{
			Scanner sc=new Scanner(System.in);
			   System.out.println("Enter the amount to withdraw");
			   double am=sc.nextDouble();
			    Ba[i].withdraw(am);
			
				
			break;
		}
		case 3:
		{
			Ba[i].display();
			
			break;
		}
		case 4:
		return;//to stop the program with successful completion
		
		}
		}
		}


}
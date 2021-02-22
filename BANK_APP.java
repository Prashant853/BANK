package csw_1;

import java.util.Scanner;

public class BANK_APP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		BankArray obj=new BankArray(100);
		obj.insert("Ritvik", 123456, 3000);
		obj.insert("Ritika", 1200, 5000);
		obj.insert("Rita", 98, 8000);
		obj.display(98);
		obj.Operate(98);
		
		
		
		
	
		
	}
	}
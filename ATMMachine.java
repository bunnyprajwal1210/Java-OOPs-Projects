import java.util.*;

class machine{
	float Balance;
	int Pin=1234;
	
	void CheckPin() {
		System.out.println("Enter the PIN");
		Scanner sc = new Scanner(System.in);
		int enteredPIN = sc.nextInt();
		
		if(enteredPIN==Pin) {
			menu();
		}else {
			System.out.println("*****Enter a valid PIN*****");
			System.out.println();
			CheckPin();
		}
	}
	
	void menu() {
			 System.out.println();
		     System.out.println("Enter Your Choice");
		     System.out.println("1. Check Account Balance");
		     System.out.println("2. Deposit Amount");
		     System.out.println("3. Withdrawal Amount");
		     System.out.println("4. Exit");
		     
		     Scanner sc = new Scanner(System.in);
		     int choice = sc.nextInt();
		     
		     if(choice==1) {
		    	 balance();
		     }else if(choice==2) {
		    	 deposit();
		    	 
		     }else if(choice==3) {
		    	 withdrawal();
		     }else if(choice==4) {
		    	 return;
		     }else {
		    	 System.out.println("*****Enter a Valid Choice*****");
		     }
	}
	
	void balance() {
	System.out.println("The Account Balance is = "+Balance);
   	 menu();
	}
	
	void deposit() {
		System.out.println("Enter the amount to deposit:");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		
		Balance = amount+Balance;
		System.out.println(amount+" is deposited sucessfully");
		menu();
	}
	
	void withdrawal() {
		System.out.println("Enter the amount to withdrawal:");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		if(money>Balance) {
			System.out.println("*****Insufficient Balance*****");
			menu();
		}else {
			Balance = Balance-money;
			System.out.println(money+" is withdrawn sucessfully");
			menu();
		}
	}
	
}

public class ATMMachine{
	public static void main(String[] args) {
		machine obj = new machine();
		obj.CheckPin();
		
	}

}

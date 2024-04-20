package practical1;

import java.util.Scanner;

class atm{
	private int balance;
	
	atm(int balance){
		this.balance=balance;
	}
	int Getbalance() {
		return balance;
	}
	public int getBalance() {
		return balance;
	}

	int Deposit(int amount) {
			
			balance=balance+amount;
			return balance;
			
			
	}
	int Withdraw(int amount) {
		if(amount>=balance) {
			System.out.println("unsufficient balance");
			return balance;
			
		}
		else {
			balance=balance-amount;
			return balance;
		}	
	}
		
}

public class ATM {
		public static void main(String args[]) {
			atm a=new atm(12000);
			Scanner sc =new Scanner(System.in);
			int choice;
			do 
			{
				
				System.out.println("Menu......");
				System.out.println("press1:withdraw");
				System.out.println("press2:deposite");
				System.out.println("press3:check balance");
				System.out.println("press4:exit");
				choice=sc.nextInt();
				switch(choice) {
				
				case 1:
						
						System.out.println("enter the money which you want to withdraw");
						int withdraw=sc.nextInt();
						int result=a.Withdraw(withdraw);
						System.out.println("the balance is:="+result);
						break;
				case 2:
						System.out.println("enter the balance which you want to deposite");
						int deposit=sc.nextInt();
						int data=a.Deposit(deposit);
						System.out.println("the balance is:="+data);
						break;
						
				case 3:
						System.out.println("the balance is:="+a.Getbalance());
						break;
				case 4:
					System.out.println("see you later");
					break;
				
					default:
							System.out.println("invalid input try again......");
				}
				
				
			}while(choice!=4);
			sc.close();
				
				
			
		}
}

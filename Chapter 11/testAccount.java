package Exercise10_7;
//Stephanie Eley
//05.13.2020

import java.util.Scanner;

public class testAccount{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		SavingsAccount save = new SavingsAccount(12, 10000);
		CheckingAccount check = new CheckingAccount(13,675);

		System.out.println("The balance is: $" + save.getBalance());
		//System.out.println("Enter amount to deposit: ");
		//double dep = input.nextDouble();
		//System.out.println("The balance is: $" + dep + save.getBalance());
		save.withdraw(20000);
		save.withdraw(2000);
		System.out.println("Savings after withdraw is: $" + save.getBalance());
		//double wd = input.nextDouble();
		//save.withdraw(wd);
		//System.out.println("The new balance is: $" + save.getBalance());
		check.withdraw(800);
		check.withdraw(650);
		System.out.println("Checking after withdraw is: $" + check.getBalance());
	}


} 

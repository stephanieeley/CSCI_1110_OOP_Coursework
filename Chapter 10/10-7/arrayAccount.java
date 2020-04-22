package Exercise10_7;

import java.util.Scanner;

//Stephanie Eley 
//Date:04-08-2020 - 4-22-2020 =(

public class arrayAccount {

	public static void main(String[] args) {
		Account[] array = new Account[10];
		Scanner input = new Scanner(System.in);
		double bal = 100;//I think ill use this for how much is in the account orginally. idk man
		double amount = 0;

		for(int i = 0; i < array.length;i++) {
			array[i] = new Account(i, bal);
			//System.out.println(" At account " + i + ": " + array[i].getBalance());
		}
		while(true) {
			System.out.print("Enter an ID number between 0-9: ");
			int userInput = input.nextInt();
			while(userInput!= 0 && userInput!= 1 && userInput!= 2 && userInput!= 3 &&
					userInput!=4 && userInput!=5 && userInput!= 6 && userInput!= 7 &&
					userInput!= 8 && userInput!= 9) {
				System.out.println("Enter a valid option." );
				System.out.print("Enter an ID number between 0-9: ");
				userInput = input.nextInt();
			}
			Account inUse = array[userInput];
			int option = 0;
			while(option!= 4) {
				System.out.println("Main menu \n1.check balance \n2.withdraw \n3.deposit \n4.exit ");
				System.out.println("Please select a choice. ");
				option = input.nextInt();
				while(option!= 1 && option!= 2 && option!= 3 && option!=4) {
					System.out.println("Enter valid number.");
					System.out.println("Main menu \n1.check balance \n2.withdraw \n3.deposit \n4.exit ");
					option = input.nextInt();
				}
				//it works currently!dont f it up
				//main menu, 1: check balance, 2:withdraw, 3:deposit, 4:exit
				//make loop to make it never end.......... 
				if(option == 1) {
					System.out.println("Your balance is: $" + inUse.getBalance());
				}
				else if(option == 2) {
					System.out.println("Enter withdraw amount: " );
					amount = input.nextDouble();
					inUse.withdraw(amount);
					System.out.printf("You withdrew: $%4.2f.\nYour new balance is $%4.2f\n.",amount , inUse.getBalance());
				}
				else if(option == 3) {
					System.out.println("Enter deposit amount: ");
					amount = input.nextDouble();
					inUse.deposit(amount);
					System.out.printf("You deposited: $%4.2f.\nYour new balance is $%4.2f\n.",amount , inUse.getBalance());
				}

			}
		}
	}
}

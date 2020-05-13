package Exercise10_7;

//stephanie eley
//05-13-2020

import java.util.Date;

public class CheckingAccount extends Account {

	double overdraft = 750;

	public CheckingAccount() {

	}
	public CheckingAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
		Date dateCreated = new Date();

	}
	public void withdraw(double amountWithdraw){
		if(amountWithdraw > (balance + overdraft) ) {
			System.out.println("You cant over draw more than 750.");
		}
		else {
			balance = balance - amountWithdraw;
		}
	}

}

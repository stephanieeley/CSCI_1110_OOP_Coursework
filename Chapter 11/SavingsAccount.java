package Exercise10_7;
//Stephanie Eley
//05-13-2020

import java.util.Date;


public class SavingsAccount extends Account{

	public SavingsAccount(){
		
	}
	public SavingsAccount(int id, double balance) {
		 this.id = id;
	        this.balance = balance;
	        Date dateCreated = new Date();
	}
	 public void withdraw(double amountWithdraw){
	       if( amountWithdraw > balance ) {
	    	   System.out.println("You cannot withdraw more than available. ");
	       }
	       else{
	    	   balance = balance - amountWithdraw;
	       }
	    }
	 
	
}

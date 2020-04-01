//Stephanie Eley
//03.26.2020

public class testAccount{

    public static void main(String[]args){

    Account act1 = new Account(1122, 20000);
    act1.setAnnualInterestRate(0.045);
    act1.withdraw(2500);
    System.out.println("Account 1 after withdraw of 2500 is " + act1.getBalance());
    act1.deposit(3000);
    System.out.println("Account 1 after deposit of 3000 is " + act1.getBalance());
    System.out.println("The monthly interest is " + act1.getMonthlyIneterst());
    System.out.println("The date the account was created is " + act1.getDateCreated());
    }
} 

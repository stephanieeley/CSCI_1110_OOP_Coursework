package Exercise10_7;
import java.util.Date;

//Stephanie Eley
//Date: 3.25.2020

public class Account{

    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;
    Date dateCreated = new Date();
    
    Account(){
        Date dateCreated = new Date();   
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        Date dateCreated = new Date();
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRates(){
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }                 
    public double getMonthlyIneterst(){
        return getMonthlyInterestRate() * getBalance();
    }
    public double getMonthlyInterestRate(){
        return getAnnualInterestRates() / 12;
    }
    public void withdraw(double amountWithdraw){
        balance = balance - amountWithdraw;
    }
    public void deposit(double amountDeposit){
        balance = balance + amountDeposit;
    }
}
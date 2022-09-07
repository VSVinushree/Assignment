package robosoft;
import java.util.*;
 class Account1 {
	private int id=0;
	private double balance=0.0;
	private double annualInterestRate=0.0;
	private Date dateCreated;
	
	public Account1 (int i,double b) {
		id=i;
		balance=b;
		dateCreated = new Date();
	}
	public int getId() {
		return id;
	}
	public double getbalance() {
		return balance;
	}
	public double getannaulInterestRate() {
		return annualInterestRate;
	}
	public void setId (int id) {
		 this.id=id;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public void setannualInterestRate(double a) {
		this.annualInterestRate=a;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	void withdraw(double w) {
		balance=balance-w;
	}
	void deposit(double w) {
		balance=balance+w;
	}
 }
public class Account {
	public static void main(String args[]) {
	Account1 a1=new Account1(47855,987422);
	a1.setId(2);
	a1.setbalance(7000);
	a1.setannualInterestRate(2);
	a1.withdraw(1543);
	System.out.println("balance " +a1.getbalance());
	System.out.println("id " +a1.getId());
	System.out.println("monthly interest rate " +a1.getMonthlyInterestRate());
	System.out.println("monthly interest " +a1.getMonthlyInterest());
	System.out.println("date " +a1.getdateCreated());
}
}




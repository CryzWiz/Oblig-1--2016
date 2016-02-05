import java.util.ArrayList;
import java.util.Date;

public class Accounts {
	

	private double annualInterestRate = 0;
	private int id;
	private double balance;
	private Date dateCreated;
	private String name;
	private ArrayList<Transactions> transactions;
	public Accounts(){
		id = 0;
		balance = 0;
		dateCreated = new Date();
	}
	public Accounts(int id, String name, double balance, double annualInterestRate){
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
		transactions = new ArrayList<Transactions>();
	}
	
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double rate){
		annualInterestRate = rate;
	}
	
	public int getId(){
		return id;
	}	
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterest(){
		return balance * (annualInterestRate / 1200);
	}
	public ArrayList<Transactions> getTransactions(){
		return transactions;
	}

	public void withdraw(double amount){
		if(balance - amount > 0){
			balance -= amount;
			transactions.add(new Transactions('W', amount, balance, "Default withdrawal."));
		}
	}
	public void deposit(double amount){
		balance += amount;
		transactions.add(new Transactions('D', amount, balance, "Default deposit."));
	}
}



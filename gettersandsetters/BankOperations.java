package gettersandsetters;

public class BankOperations {
	
	private String accountHolder;
	private long accountNumber;
	private double balance;
	
	public void  setAccountHolder(String name) {
		
		this.accountHolder=name;
		
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountNumber(long num) {
		this.accountNumber=num;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setBalance(double amount) {
		if(amount>=0) {
		this.balance=amount;
		}
	}
	public double getBalance() {
		return balance;
		
		
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("amount deposited successfully");
		}
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("amount withdraw succefully");
		}
		else {
			System.out.println("insufficient balance");
		}
	}

}

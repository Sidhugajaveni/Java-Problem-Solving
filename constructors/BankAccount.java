package constructors;

public class BankAccount {
	private long accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(long num,String name,double amount ) {
		this.accountNumber=num;
		this.accountHolderName=name;
		this.balance=amount;
	
	}
	public BankAccount(long num,String name) {
		this.accountNumber=num;
		this.accountHolderName=name;
		this.balance=0;
	
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("current balance:"+balance);
		}
	}
	
	public void displayDetails() {
		 
		System.out.println("accountNumber:"+accountNumber+"\n"+"accountholder:"+accountHolderName+"\n"+
	" balance:"+balance);
		 System.out.println("-----------------------------------");
				
	}

	
	

}

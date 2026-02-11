package gettersandsetters;
//Bank Operations ELC
import java.util.Scanner;

public class BankOperationMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankOperations bank=new BankOperations();
		bank.setAccountHolder("sidhu");
		System.out.println("Account Holder:"+bank.getAccountHolder());
		bank.setAccountNumber(3214532124l);
		System.out.println("Account number:"+bank.getAccountNumber());
		bank.setBalance(500000.00);
		
		System.out.print("enter amount to withdraw:");
		bank.withdraw(sc.nextInt());
		System.out.println("current balance:"+bank.getBalance());
		sc.close();
		
		

	}

}

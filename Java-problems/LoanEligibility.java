package problems;
//Loan eligibility

public class LoanEligibility {
	int age;
	int salary;
	public  String isEligible() {
		if (age>=21 && salary>20000)
			return "Eligible for loan";
			else
				return "Not eligible for loan";		
		
	}
  public  void initialize (int a,int b) {
	  age=a;
	  salary=b;
  }
	public static void main(String[] args) {
		LoanEligibility loan=new  LoanEligibility();
		loan.initialize(21,25000);
		String eligible=loan.isEligible();
		System.out.println(eligible);	
	}

}

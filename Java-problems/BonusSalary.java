package problems;

public class BonusSalary {
	public static void bonus(int salary) {
		if (salary>25000) {
			System.out.println("Employee is Eligible for bonus");
		}
		else 
		{
			System.out.println("Employee is not Eligible for bonus");
		}
	}

	public static void main(String[] args) {
            bonus(50000);

	}

}

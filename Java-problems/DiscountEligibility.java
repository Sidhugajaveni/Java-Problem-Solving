package problems;
//Discount Eligibilty

public class DiscountEligibility {
	int cost;
	public void isEligible() {
		if(cost>5000) 
		{
			System.out.println("Eligible for discount");
		}
		else
		{
			System.out.println("Not Eligible for discount");
		}
	}
	public void value(int a) {
		cost=a;
	}
	

	public static void main(String[] args) {
		DiscountEligibility disc=new DiscountEligibility();
		disc.value(5000);
		disc.isEligible();
		

	}

}

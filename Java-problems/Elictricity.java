package problems;

//Elictricity bill Calculation

public class Elictricity {
	double units;
	double bill=0;
	public void elictricityBill() {
		if(units<=100) {
			bill=units*2;
			System.out.println("electricity consumed "+units+" units "+ " bill is "+bill);
		}
		else if (units<=200)
		{
			bill=units*3;
			System.out.println("electricity consumed "+units+" units "+ " bill is "+bill);
		}
		else {
			bill=units*5;
			System.out.println("electricity consumed "+units+" units "+ " bill is "+bill);
			
		}
	}
	public void initialize(double a) {
		units=a;
	}

	public static void main(String[] args) {
		Elictricity power=new Elictricity();
		power.initialize(210);
		power.elictricityBill();

	}

}

package problems;

//Leap year 

public class LeapYear {
	int year;
	public void yearLeap() {
	if ( year%400==0 || (year%4==0 && year%100!=0)) {
		System.out.println(year+" is leap year");
		
	}
	else
	{
		System.out.println(year+" is not a leap year");
	}
	}
	
	public void initialize(int a) {
		year=a;
	}
	public static void main(String[] args) {
		LeapYear leap=new LeapYear();
		leap.initialize(2000);
		leap.yearLeap();
		
		

	}

}

package problems;
// Temperature check

public class Temperature {
	public static void  temp(double temperature) {
		if (temperature>=35) {
			System.out.println("Very hot");		

	    }
	     else if (temperature>=25) 
	     {
		System.out.println("Hot");
	    }
	     else if (temperature>=15) {
	    	 System.out.println("Warm");
	     }
	     else {
	    	 System.out.println("Cold");
	     }	
	}
	

	public static void main(String[] args) {
		temp(39.1);
		

}
}

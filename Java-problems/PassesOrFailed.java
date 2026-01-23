package problems;
//Student passed or Failed
public class PassesOrFailed {
	 public static void result(int marks) {
		if(marks>=40) {
			System.out.println("Student Passed");
		}
		else {
			System.out.println("Student Failed");
		}
		
	}

	public static void main(String[] args) {
		result(50);
		

	}

}

package problems;
//Exam Results

public class ExamResult {
	static int marks;
	public static void result() {
		if(marks>35)
		{
			System.out.println("Student Passed");
		}
		else {
			System.out.println("Supplementary");
		}
	}
 public static void value(int a) {
	 marks=a;
 }
	public static void main(String[] args) {
		value (4);
		result();

	}

}

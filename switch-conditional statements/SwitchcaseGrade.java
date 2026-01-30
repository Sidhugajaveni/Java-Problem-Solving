package problemsolving;

public class SwitchcaseGrade {

	public static void main(String[] args) {
		char grade ='C';
		switch(grade) {
		case 'A':
			System.out.println("76-100");
			break;
		case 'B':
			System.out.println("51-75");
			break;
		case 'C':
			System.out.println("36-50");
			break;
		case 'F':
			System.out.println("0-35");
			break;
		default:
			System.out.println("invalid Marks");
		}

	}

}

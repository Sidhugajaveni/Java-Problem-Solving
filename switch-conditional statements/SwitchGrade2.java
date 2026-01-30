package problemsolving;

public class SwitchGrade2 {

	public static void main(String[] args) {
		char grade ='B';
		switch(grade) {
		case 'A':
		case 'a':  
			System.out.println("76-100");
			break;
		case 'B':
		case 'b':
			System.out.println("51-75");
			break;
		case 'C':
		case 'c':
			System.out.println("36-50");
			break;
		case 'F':
		case 'f':
			System.out.println("0-35");
			break;
		default:
			System.out.println("invalid Marks");
		}

	}

}

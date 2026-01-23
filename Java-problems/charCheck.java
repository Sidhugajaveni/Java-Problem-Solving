package problems;
//checking given input uppercase or lowercase or digit

public class charCheck {
	static char ch;
	public static void checkChar() {
		if(ch>='0' && ch<='9') {
			System.out.println(ch+" is digit");
		}
		else if(ch>='A' && ch<='Z'){
			System.out.println(ch+" is Uppercase letter");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" is lowercase letter");
		}
		else {
			System.out.println("Special Character");
		}
		
	}
	public static void initialize(char a) {
		ch=a;
	}

	public static void main(String[] args) {
		initialize('c');
		checkChar();
		

	}

}

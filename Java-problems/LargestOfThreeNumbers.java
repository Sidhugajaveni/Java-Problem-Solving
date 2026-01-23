package problems;

//Largest of three numbers

public class LargestOfThreeNumbers {
	int a;
	int b;
	int c;
	public void Largest() {
		if (a>b && a>c) {
			System.out.println("a is largest number");
		}
		
		else if (b>c) {
			System.out.println("b is largest number");
		}
		else {
			System.out.println("C is largest number");
		}
		
	}
	public void initialization(int first ,int second,int third) {
		 a=first;
		 b=second;
		 c=third;
	}

	public static void main(String[] args) {
		LargestOfThreeNumbers lar=new LargestOfThreeNumbers();
		lar.initialization(10,7,11);
		lar.Largest();	

	}

}

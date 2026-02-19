package methodoverloadingandconstructorchaining;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
		EmployeeDetails e1=new EmployeeDetails();
		EmployeeDetails e2=new EmployeeDetails(101,"sidhu");
		EmployeeDetails e3=new EmployeeDetails(102,"sidartha","general");
		EmployeeDetails e4=new EmployeeDetails(103,"ram","IT",35000);
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		e4.displayDetails();
		

	}

}

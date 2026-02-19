package methodoverloadingandconstructorchaining;

public class EmployeeDetails {
	private int empId=0;
	private String empName="unknown";
	private String department="Not assigned";
	private double basicSalary=0;
	private double hra;
	private double da;
	private double netSalary;


	public EmployeeDetails() {
	this (0,"unknown");
	  
	System.out.println("default constructor");
	
	}
	public EmployeeDetails(int empId,String empName) {
		this(empId,empName,"general");
		System.out.println("constructer with empid and name");
	
	}
	public EmployeeDetails(int empId,String empName,String department){
		this (empId,empName,department,20000);
		System.out.println("constructor with empid,name,deparment");
	}
	public EmployeeDetails(int empId,String empName,String department,double basicSalary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.basicSalary=basicSalary;
		hra=0.20*basicSalary;
		da=0.10*basicSalary;
		 netSalary=basicSalary+hra+da;
		System.out.println("full parameterized constructor");
		 
		
		
	}
	public void displayDetails(){
		  System.out.println("---------------------------");
	      System.out.println("Employee ID: " + empId);
	        System.out.println("Employee Name: " + empName);
	        System.out.println("Department: " + department);
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("HRA: " + hra);
	        System.out.println("DA: " + da);
	        System.out.println("Net Salary: " + netSalary);
	        System.out.println("---------------------------");
	}
	


	


}

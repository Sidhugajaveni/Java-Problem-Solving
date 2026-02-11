package gettersandsetters;
//employee details elc
public class EmployeeDetailsMain {

	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.setEmpName("sidartha");
		System.out.println("Employee:"+emp.getEmpName());
		emp.setEmpId(23531);
		System.out.println("employee id:"+emp.getEmpId());
		emp.setSalary(45000);
		System.out.println("Salary:"+emp.getSalary());
		

	}

}

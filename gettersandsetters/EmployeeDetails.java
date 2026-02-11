package gettersandsetters;
//employee details BLC

public class EmployeeDetails {

        private String empName;
        private int empId;
        private double salary;
        
        public void setEmpName(String name) {
        	this.empName=name;
        }
        public String getEmpName() {
        	return empName;
        }
        public void setEmpId(int id) {
        	this.empId=id;
        }
        public int getEmpId() {
        	return empId;
        }
        public void setSalary(double salary) {
        	this.salary=salary;
        }
        public double getSalary() {
        	return salary;
        }

}

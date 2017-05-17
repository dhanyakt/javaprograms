
public class Employee extends Person{
	private String empId;

	public Employee(String string) {
		super("321");
		this.empId = string;
	}

	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	

}

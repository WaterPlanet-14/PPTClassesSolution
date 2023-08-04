package assignment8;
public class Employee_q5 {
	private double salary;
	private int workHoursPerDay;
	public Employee_q5(double salary, int workHoursPerDay) {
		this.salary = salary;
		this.workHoursPerDay = workHoursPerDay;
	}
	public void getInformation() {
		System.out.println("Employee Salary: $" + salary);
		System.out.println("Number of Work Hours per Day: " + workHoursPerDay);
	}
	public void addSalary() {
		if (salary < 500) 
			salary += 10;
	}
	public void addWork() {
		if (workHoursPerDay > 6) 
			salary += 5;
	}
	public double getFinalSalary() {
		return salary;
	}
	public static void main(String[] args) {
		Employee_q5 emp = new Employee_q5(480, 8);
		emp.getInformation();
		emp.addSalary();
		emp.addWork();
		System.out.println("Final Salary: $" + emp.getFinalSalary());
	}		
}

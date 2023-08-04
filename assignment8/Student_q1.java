package assignment8;

public class Student_q1 {
	private String name;
	private int registrationNumber;
	private String dateOfBirth;
	private String branch;
	public Student_q1(String name, int registrationNumber, String dateOfBirth, String branch) {			//constructor
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.dateOfBirth = dateOfBirth;
		this.branch = branch;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Registration Number: " + registrationNumber);										//display
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Branch: " + branch);
		System.out.println("------------------------");
		System.out.println();
	}
	public static void main(String[] args) {
		Student_q1[] students = new Student_q1[5];
		students[0] = new Student_q1("John Doe", 1234, "2001-01-15", "Computer Science");
		students[1] = new Student_q1("Jane Smith", 5678, "2002-05-30", "Electrical Engineering");
		students[2] = new Student_q1("Mike Johnson", 9012, "2000-11-22", "Mechanical Engineering");					//5 students
		students[3] = new Student_q1("Emily Brown", 3456, "2003-08-10", "Civil Engineering");
		students[4] = new Student_q1("David Lee", 7890, "1999-04-05", "Chemical Engineering");
		for (Student_q1 student : students) {
			student.displayInfo();
		}
	}
}

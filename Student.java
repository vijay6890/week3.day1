package week3.day1Assignments;

public class Student extends Department {

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student name: Vijay Kumar");
	}

	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Dept: 'CS'");
	}

	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student ID: 6890");
	}

	public static void main(String[] args) {
		
		System.out.println("LETS HAVE SOME FUN STUDENTS");
		System.out.println("");
		
		Student s = new Student();
		s.collegeName();
		// Private Method s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();

	}

}

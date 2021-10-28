package week3.day1Assignments;

public class Students {
	
	public void getStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		id = 1000;
		System.out.println("Student ID: " +id);
	}
	
	public void getStudentInfo(int id, String name) {
		//id= 2000;
		//name = "Vijay";
		System.out.println("Student ID: " +id+ " Student name is: "+name);
		// TODO Auto-generated method stub

	}
	
	private void getStudentInfo(int id, String email, String phoneNumber ) {
		// TODO Auto-generated method stub
		//id = 3000;
		//email = "v@c.com";
		//phoneNumber= "0468481044";
		System.out.println("My id is " +id+ " My email is: " +email + " My Phone is: " +phoneNumber);
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo();
		s.getStudentInfo(1000);
		s.getStudentInfo(2033, "Vijay");
		s.getStudentInfo(50000, "v@c.com", "9940434493");
	}

}

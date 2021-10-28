package week3.day1Assignments;

public class Assignment5 {

	public static void main(String[] args) {
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		
		 if(str3==str4) 
		 //if(str3.equals(str4)) //This will give an outout as same text 
		 {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		
		 System.out.println("*****");
		 
		 System.out.println("Justification: Only memory location is compared here not the actual string values, So this will give different text as output");
		 
		 System.out.println("If we have used .equals method then that would have verified the string contents than memory location");
	}
}

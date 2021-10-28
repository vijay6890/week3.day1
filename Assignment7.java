package week3.day1Assignments;

public class Assignment7 {
	
	public static void main(String[] args) {
		String text = "Java Exercise";	
		int i = text.indexOf('E');
		int ii = text.indexOf('s');
		System.out.println("Index of chracted E & s is: " +i+" & "+ii);
		String str3 = new String("I am learning java");
		String str4 = new String("I am Learning Java");
		
		 //if(str3.equals(str4)) 
		 //if(str3==str4)
		 if(str3.equalsIgnoreCase(str4))
		 //if(str3.equals(str4)) //This will give an outout as same text 
		 {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 String str5= "I am working with Java8";
		 
		 System.out.println(str5.charAt(10));
		 System.out.println(str5.replace("8", "11"));
		 char[] charArray = str5.toCharArray();
		 for (int j = 0; j < charArray.length; j++) {
			 System.out.println("Char Array is+["+j+"]" +charArray[j]);
			 System.out.println(str5.substring(5, 15));
		
		}
}
	
}
/*


Assignment 7:
==============
Write a Java program to get the character at the given index within the String.
String text = Java Exercise
  Index for character E and s                                                 
  
============================================================================
2.Write a Java program to compare a given string to another string, ignoring case considerations.
String 1="I am Learning Java"
String 2="I am learning java?  
**  Explore with == operator
**               equals
**               equalsignorecase                                     
=============================================================================
3.Write a Java program to replace a specified character with another character and add # to the given string.
String sentence = "I am working with Java8"
replace 8 to 11
Print the characters from 5 to 14

*/
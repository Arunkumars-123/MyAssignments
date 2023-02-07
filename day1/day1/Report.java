/*Assignment:5
=========
Create Class Student
declare variables
studentName
rollNo
collegeName
markScored
cgpa

Create a class Report and create object for student class in main method and print all the variables*/
 
package week1.day1;

public class Report {

	public static void main(String[] args) {
		
		Student obj = new Student();
		System.out.println("Name of the Student : "+ obj.studentName);
		System.out.println("Student Roll NO :" + obj.rollNo);
		System.out.println("College Name of the student : " + obj.collegeName);
		System.out.println("Student marks Scored : " +obj.markScored);
		System.out.println("Student CGPA :" +obj.cgpa);

	

	}
	
}

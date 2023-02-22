  /*  Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
;*/

package assignment;
public class Students {
	
	public void getStudentInfo(int id) {
		 
		 System.out.println("my id" + id);
		 
		}
	
	public void getStudentInfo (int id , String name) {
		
		
		System.out.println("my id" + id);
		System.out.println("my name is " + name);
	}
	
	
	public void getStudentInfo (String email, int phoneNumber)
	{
		
		System.out.println("my email id is " + email);
		System.out.println("my mob no is " + phoneNumber);
	}
	
	
	public static void main(String[] args) {
		
		
		Students obj = new Students();
		
		obj.getStudentInfo(123, "Arun");
		obj.getStudentInfo("Arun@gmail.com",124);
		obj.getStudentInfo(123);
		
		

	}

}
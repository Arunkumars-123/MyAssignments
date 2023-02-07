/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console */

package week1.day1;

public class Mobile {
	
    public void makeCall()   {
    	
    	String mobileModel = "oopo"; 
    	float mobileWeight = 0.99f;
    	
    	
    	System.out.println("THE mobile model is "  + mobileModel   +  "  The mobie weight is "  +mobileWeight);
    }
    

	   public void sendSms()
	{
		   
		   boolean fullyCharged = true;
		   int mobileCost =10000;
		   
	System.out.println("Mobile is fully charged "  + fullyCharged   +  " the mobile cost is "  +mobileCost);	
	}
  
	   
	   
	   public static void main(String[] args) {
		   
		   
	Mobile calling = new Mobile();
	calling.sendSms();
	calling.makeCall();
	System.out.println("This is my mobile");

	 }
 
}

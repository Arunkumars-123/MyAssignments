/*Assignment:2

Check the given number is palindrome or not 

Int num =34343

Initialize a  temporary variable.

Reverse the number (using for loop and add to the temporary variable)

Compare the temporary number with reversed number

If both numbers are same, print "palindrome number"

Else print "not palindrome number"*/


package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int num =34343;
		
		int temp =0 ;
		for (int i=0 ; i<5 ; i++)
		{
			temp = temp*10 + num % 10 ;
			
			
			num = num/10;
		}
		if (temp==num) {
			System.out.println("the given number is palindrome");
			
		} else
			System.out.println("the given number is not a palindrome ");
	}

}

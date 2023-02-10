package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num =8;
		int result;
		int firstNumber =0;
		int secondNumber =1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for (int i =2 ; i<num ;i++)
		{
			result = firstNumber+secondNumber;
			firstNumber =secondNumber;
			secondNumber=result;
			System.out.println(result);
			
		}
	}

}

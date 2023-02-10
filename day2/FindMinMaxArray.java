package week1.day2;


import java.util.Arrays;



public class FindMinMaxArray {

	

	public static void main(String[] args) {
		int[] num = {22, 3981, -19, 82, 0, 45, 37};
		Arrays.sort(num); 
	
			System.out.println("the min value is"+ num[0]);
			System.out.println("the max value is" +num[num.length-1]);	}
	

}



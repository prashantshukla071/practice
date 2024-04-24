package Java_Brushup;

import java.util.Scanner;

public class BiggestandSmallestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		int largestDigit = Integer.MIN_VALUE;
		int smallestDigit = Integer.MAX_VALUE;
		
		System.out.println("Initial Largest Digit assigned by Java: "+smallestDigit);
		System.out.println("Initial Smallest Digit assigned by Java: "+largestDigit);
		
//		int remainingNumber = number;
		
		while(number>0) {
			int digit = number % 10;
			
			largestDigit = Math.max(largestDigit, digit);
			smallestDigit = Math.min(smallestDigit, digit);
			
			System.out.println("Largest digit: "+largestDigit);
			System.out.println("Smallest digit: "+smallestDigit);
			
			number = number/10;	
			
		}
		System.out.println("======================================================================");
		System.out.println("Final Largest digit: "+largestDigit);
		System.out.println("Final Smallest digit: "+smallestDigit);
		
		sc.close();
		
	}
	

}

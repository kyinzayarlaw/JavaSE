package kzl;
import java.util.Scanner;
public class DigitWithArray {
		
	public static void main(String[]args) {
		int digit;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a digit");
		digit = scn.nextInt();
		
		switch(digit) 
		{
		case 0: 
			System.out.println("Zero");
		break;
		case 1: 
			System.out.println("One");
		break;
		case 2: 
			System.out.println("Two");
		break;
		default: 
			System.out.println("Sorry for that");
		}
		
		
	}
}

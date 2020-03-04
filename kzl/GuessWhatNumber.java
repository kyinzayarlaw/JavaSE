package kzl;
import java.util.Scanner;
public class GuessWhatNumber {
	public static void main(String[] args) {
		
		int guessNo;
		int correctNo;
		correctNo = (int) (Math.random()*10) +1;
		Scanner sccn = new Scanner(System.in);
		
		int tries = 0;
		do {
			System.out.println("Enter Your Guess Number ");
			guessNo = sccn.nextInt();
			if(guessNo > correctNo)
			{
				System.out.println("OOPS THAT'S TOO LARGE");				
			}
			else if(guessNo < correctNo) 
			{
				System.out.println("Oops that's too small");
				
			}
			
			tries++;
		}while(guessNo != correctNo);
				System.out.println("Bingo, Correct Man! It's "+ tries +"tries");
		}
	}

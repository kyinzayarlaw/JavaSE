package kzl;
import java.util.Scanner;
public class ArrayFindUseFor{
	
	
	public static void main(String args[]) {
		int arr[][] = {
				{1,2,3,4,5,6},
				{20,30,40,50},
				{100,200}
		};
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Key Value");
			
			int key = scn.nextInt();
			boolean flag = false;
			
			outer: for(int i=0; i < arr.length; i++)
			{
				System.out.println("Outer loop" + i);
				for(int j =0; j < arr[i].length; j++)
				{
					System.out.println("inner j " +j );
					if(arr[i][j] == key)
					{
						System.out.println("Key Found at i " + i + " j "+ j);
						flag = true;
						break outer;
					}
				}
			}
		if(!flag) 
		{
			System.out.println("Key Not Found");
		}
		
		
	}
}
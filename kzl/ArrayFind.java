package kzl;

import java.util.Scanner;

public class ArrayFind {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter key to find");
		
		
		int key = scn.nextInt();
		boolean flag =false;
		
		int i=0;
		while(!flag && i<arr.length)
		{
			if(arr[i] == key)
			{
				System.out.println(key + "KEY FOUND AT " + i);
				flag = true;
			}
			i++;
		}
		
		if( !flag) 
		{
			System.out.println("Key doesn't exist");
		}
	}
}

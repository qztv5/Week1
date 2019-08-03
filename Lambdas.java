package com.Anderson.Week1;

import java.util.Scanner;
import java.util.function.*;


public class Lambdas {
	
	public static void main(String[] args)
	{
	
		Consumer<Integer>isOdd = (Integer x) ->
		{
		 if(x%2 == 0)
		 {
			 System.out.println("Even");
		 }
		 else
		 {
			 System.out.println("Odd");
		 }
		};
		
		Consumer<Integer> checkPrime = (Integer x) ->
		{
			if (x == 1) {
			System.out.println("Prime");
			}
			else
			{
				for(int i = 2; i<x/2+1; i++)
				{
					if((x%i)==0)
					{
						System.out.println("Composite");
					}
					else
						System.out.println("Prime");
				}
			}
			
		};
		
		Consumer<Integer> checkPalindrome = (Integer x) ->
		{
			String num = ""+x;
			for(int i= 0; i<num.length()/2;i++)
			{
				if(num.charAt(i) != num.charAt(num.length()-1-i))
				{
					System.out.println("Not a palindrome");
				}
				else
				{
					System.out.println("Palindrome");
				}
					
			}
		};
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of operations you would like ot perform");
		int count = in.nextInt();
		for(int i = 0; i<count; i++)
		{
			System.out.println("Enter 1, 2, or 3 followed by another number");
			System.out.println("1 checks if the number is Even or Odd");
			System.out.println("2 checks if the number is prime or not");
			System.out.println("3 checks if the number is a palindrome, ex 404");
			int key = in.nextInt();
			int num = in.nextInt();
			
			switch(key) 
			{
			case 1:
				isOdd.accept(num);
				break;
			case 2:
				checkPrime.accept(num);
				break;
			case 3:
				checkPalindrome.accept(num);
				break;
			}
		}
	}
	
}

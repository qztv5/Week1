package com.Anderson.Week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Functional {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter a list of non-negative numbers");
		//List<Integer> nItems = new ArrayList<Integer>();
		List<String> sItems = new ArrayList<String>();
		sItems.add("a");
		sItems.add("ax");
		sItems.add("xb");
		sItems.add("xxcxx");
		sItems.add("x");
		sItems.add("xx");
 		/*while(in.hasNextInt())
		{
			nItems.add(in.next());
			System.out.println("In loop");
		}*/
 		//rightMost(nItems);
		//nItems.forEach(System.out::println);
		//doubling(nItems);
		//nItems.forEach(System.out::println);
 		//noX(sItems);
 		//sItems.forEach(System.out::println);
 		int[] intArray = {2,2, 4 ,8};
 		System.out.println(groupSumClump(0, intArray, 14));
		
		
	}
	
	public static List<Integer> rightMost(List<Integer> l)
	{
		l.replaceAll(n -> n % 10);
		return l;
	}
	
	public static List<Integer> doubling(List<Integer> l)
	{
		l.replaceAll(n -> n * 2);
		return l;
	}
	
	public static List<String> noX(List<String> l)
	{
		l.replaceAll(n -> n.replace("x", ""));
		return l;
	}
	
	public static boolean groupSumClump(int start, int[] nums, int target) {
	    if(start >= nums.length)
	        return target == 0;
	          
	    int i = start;
	    int sum = 0;
	    
	    while(i < nums.length && nums[start] == nums[i]) {
	        sum += nums[i];
	        i++;
	    }
	                              
	    if(groupSumClump(i, nums, target - sum))
	        return true;
	                                        
	    if(groupSumClump(i, nums, target))
	        return true;
	                                                  
	    return false;
	}
	
	

}

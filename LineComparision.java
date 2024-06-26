package org.ContractPod.Linecomparison;

import java.util.Scanner;

public class LineComparision implements Comparable
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinates for 1rst line");
		System.out.println("Enter the x co-ordinate: ");
		int x1 = sc.nextInt();
		System.out.println("Enter the y co-ordinate: ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter the x co-ordinate: ");
		int x2 = sc.nextInt();
		System.out.println("Enter the y co-ordinate: ");
		int y2 = sc.nextInt();
		
		Integer length1 = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("Length of line is "+ length1);
		
		System.out.println("Enter the co-ordinates for 1rst line");
		System.out.println("Enter the x co-ordinate: ");
		int x21 = sc.nextInt();
		System.out.println("Enter the y co-ordinate: ");
		int y21 = sc.nextInt();
		
		System.out.println("Enter the x co-ordinate: ");
		int x22 = sc.nextInt();
		System.out.println("Enter the y co-ordinate: ");
		int y22 = sc.nextInt();
		
		Integer length2 = (int) Math.sqrt(Math.pow((x22-x21),2) + Math.pow((y22-y21),2));
		System.out.println("Length of line is "+ length2);
		
		String l1 = Integer.toString(length1);
		String l2 = Integer.toString(length2);
		//if(l1.equals(l2)) by using equals method
		
		int comparison = length1.compareTo(length2);
		
		if(comparison>0)
		{
			System.out.println("Length of line 1 is greter than length of line 2");
		}
		else if(comparison<0)
		{
			System.out.println("Length of line 2 is greter than length of line 1");
		}
		else
		{
			System.out.println("Length of line 1 and line 2 are equal.");
		}
	}

	
	public int compareTo(Object o) 
	{
		
		return 0;
	}

}

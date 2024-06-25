package org.ContractPod.Linecomparison;

import java.util.Scanner;

public class LineComparision 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x co-ordinate: ");
		int x1 = sc.nextInt();
		System.out.println("Enter the x co-ordinate: ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter the x co-ordinate: ");
		int x2 = sc.nextInt();
		System.out.println("Enter the x co-ordinate: ");
		int y2 = sc.nextInt();
		
		int length = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("Length of line is "+ length);
	}

}

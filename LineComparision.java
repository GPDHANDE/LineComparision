package org.ContractPod.Linecomparison;

import java.util.Scanner;

public class LineComparision implements Comparable
{
	private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;
    float lengthOfLine;
	
    public float getLengthOfLine() {
        return lengthOfLine;
    }

	public LineComparision(int x1, int x2, int y1, int y2) 
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public static float LengthOfLine(int x1,int y1,int x2,int y2)
	{
		Integer length= (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		return length;
	}
	
	public static void compareTo(float lengthOfLine1, float lengthOfLine2)
	{
        if(lengthOfLine1 == lengthOfLine2){
            System.out.println("Line 1 and line 2 are equal");
        }else{
            System.out.println("Line 1 and line 2 are not equal");
        }
    }
//	public static void compareTo(Integer length1,Integer length2) 
//	{
//		int comparison = length1.compareTo(length2);
//		if(comparison>0)
//		{
//			System.out.println("Length of line 1 is greter than length of line 2");
//		}
//		else if(comparison<0)
//		{
//			System.out.println("Length of line 2 is greter than length of line 1");
//		}
//		else
//		{
//			System.out.println("Length of line 1 and line 2 are equal.");
//		}
//	}
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
		
		System.out.print("Length of line1 is ");
		float a =LengthOfLine(x1,y1,x2,y2);
		System.out.println("length of line1 is "+1);

//		Integer length1 = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
//		System.out.println("Length of line is "+ length1);
		
		System.out.println("Enter the co-ordinates for 1rst line");
		System.out.println("Enter the x co-ordinate: ");
		int x21 = sc.nextInt();
		System.out.println("Enter the y co-ordinate: ");
		int y21 = sc.nextInt();
		
		System.out.println("Enter the x co-ordinate: ");
		int x22 = sc.nextInt();
		System.out.println("Enter the y co-ordinate: ");
		int y22 = sc.nextInt();
		
		System.out.print("Length of line2 is ");
		float b= LengthOfLine(x21,y21,x22,y22);
		System.out.println("length of line2 is "+b);
		compareTo(a,b);
	}	

}

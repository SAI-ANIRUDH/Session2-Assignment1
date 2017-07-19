package assignment4;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {

int a; // Declaring a //
int b; //Declaring b //
int c;  // Declaring c //
Scanner sc = new Scanner(System.in); // Using Scanner Class to give inputs from user//
System.out.println("Please input a");
a= sc.nextInt();   // Giving input for a//
System.out.println("Please input b");
b= sc.nextInt();   // Giving input for b//
System.out.println("Please input c");
c= sc.nextInt(); // Giving input for c//
if ((a > b) && (a>c)) // Comparison between a , b and c using Logical And Operators -- If this condition becomes true a will be maximum// 
{
	System.out.println("a is Maximum");
}
else  {
	System.out.println("a is Minimum");
	}
if ((a < b) && (b >c) // Comparison between a , b and c using Logical And Operators -- If this condition becomes true b will be maximum// 

{
	System.out.println("b is Maximum");
}
	
	else {
		System.out.println("b is Minimum");
		
	}
if ((c>a) && (c>b)) // Comparison between a , b and c using Logical And Operators -- If this condition becomes true c will be maximum// 
    {
	System.out.println("c is Maximum");
}
else {
	System.out.println("c is Minimum");
	
}
	}
}

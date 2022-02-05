package com.bablu.phase1;
import java.util.Scanner;
public class Program1 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter a number as string Input");
		String input=scan.nextLine();
		System.out.println(input+20);
		//Explicit type casting String to Integer.
		int n = Integer.parseInt(input);
		//Demonstrating the successful conversion of string to int.
		System.out.println(n+100);
		//Conversion of String to Double.
		double m = Double.parseDouble(input);
		System.out.println(m+200);
		//Conversion of String to Char
		char ch = input.charAt(0);
		System.out.println(ch);
		
		scan.close();
		
	}

}

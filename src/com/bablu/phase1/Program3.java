package com.bablu.phase1;
import java.util.Scanner;

class Calculator{
	public void welcomeOptions() {
		System.out.println("Welcome to Arithmetic Calculator");
		System.out.println("Select the operation to perform");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. Exit");
	}
	public void inputs() {
        Scanner scan = new Scanner(System.in);
		int opt=scan.nextInt();
		int input1,input2;
		System.out.println("Enter the first number");
		input1=scan.nextInt();
		System.out.println("Enter the Second number");
		input2=scan.nextInt();
		if (opt==1) {
			addition(input1,input2);
		}
		else if(opt==2){
			substraction(input1,input2);
		}
		else if(opt==3) {
			division(input1,input2);
		}
		else if(opt==4) {
			multiplication(input1,input2);
		}
		else if(opt==5) {
			exit();
		}
		else {
			System.out.println("Wrong Input");
		}
	}
	public void addition(int a,int b) {
		System.out.println("Addition:"+ (a+b));
		
	}
	public void substraction(int a,int b) {
		System.out.println("Substraction:" + (a-b));
		
	}
	public void division(int a,int b) {
		System.out.println("Division:"+ (a/b));
		
	}
	public void multiplication(int a,int b) {
		System.out.println("Multiplication:" + (a*b));
		
	}
	public void exit() {
		System.exit(0);
	}
	
}

public class Program3 {
	
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		obj.welcomeOptions();
		obj.inputs();
		
		
		
		
		
		
		
		
		
	}

}
  
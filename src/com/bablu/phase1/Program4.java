package com.bablu.phase1;
class Runa{
	public void method1(){
		System.out.println("method with void return type");
	}
	public int method2(int a){
		System.out.println("method with int return type");
		
		return a;
	}
	public float method3(float f){
		System.out.println("method with float return type");
		
		return f;
	}
	public double method4(double d){
		System.out.println("method with double return type");
		
		return d;
	}
	public String method5(String str){
		System.out.println("method with String return type");
		
		return str;
	}
	
}
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runa obj=new Runa();
		obj.method1();
		int a = obj.method2(5);
		System.out.println(a);
		float b=obj.method3(6);
		System.out.println(b);
		double c =obj.method4(5.6);
		System.out.println(c);
		String s = obj.method5("where");
		System.out.println(s);
		
		

	}

}

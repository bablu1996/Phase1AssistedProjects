package com.bablu.phase1;
class Demo{
	public int alpha=30;
	private int beta=20;
	protected int gamma=40;
	int zeta=50;
	public void sms() {
		System.out.println("Example of public method ");	
	}
	private void sms2() {
		System.out.println("Example of private method");
	}
	protected void sms3() {
		System.out.println("Example of protected method");
	}
	void sms4() {
		System.out.println("Example of default method");
	}
}


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj1=new Demo();
		//Public access modifier example
		System.out.println(obj1.alpha);
		//private access modifier example
		//System.out.println(obj1.beta);  //Gives Compile time error because private instance variable or method cannot be access outside of class
		//Protected access modifier example
		System.out.println(obj1.gamma);
		//Default access modifier example
		System.out.println(obj1.zeta); 
		//Accessing a public method from class demo
		obj1.sms();
		//Accessing a private method from class demo
        // obj1.sms2(); // Gives compilation error since private method is not accessible outside of class demo. 
        //Accessing a protected method from class demo
        obj1.sms3();
        //Accessing a default method from class demo
        obj1.sms4();
	}

}

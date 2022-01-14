package org.inheritance;

public class classA {
	
	public void student() {
		System.out.println("Iam a Student");
		
	}
	
	protected void staff() {
		System.out.println("Iam a Staff");
		
		
	}
	public static void main(String[]args) {
		classA ca=new classA();
		ca.student();
		ca.staff();
		
	}

}

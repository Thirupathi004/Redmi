package org.MethodOverloading;

public class MethodOverloadingg {
	
	public void customer(int id) {
		System.out.println("CustomerID;" +id);
		
	}
	
	public void customer(String name) {
		System.out.println("CustomerNAME;" +name);
		
	}
	
	public void customer(int dob,double salary) {
		System.out.println("CustomerDOB;" +dob);
		System.out.println("CustomerSalary;" +salary);
		
	}
	
	
public static void main(String[] args) {
		
	MethodOverloadingg ss=new MethodOverloadingg();
	ss.customer(636);
	ss.customer("AJITH");	
	ss.customer(30081996, 4567.9);
	
		

	}

}

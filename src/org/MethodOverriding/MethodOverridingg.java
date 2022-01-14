package org.MethodOverriding;
import org.MethodOverloading.MethodOverloadingg;


public class MethodOverridingg extends MethodOverloadingg{
	
	public void customer(int id) {
		System.out.println("CustomerID +id");
		
	}
	
	public void customer(String name) {
		System.out.println("Customer Name +Name");
		
		
	}
	public void customer (int dob,double salary) {
		super.customer(dob, salary);
		System.out.println("CustomerDOB: "+dob);
		System.out.println("Customer Salary :"+salary);
		
		
		
	}
	public static void main(String[]args) {
		MethodOverridingg ap=new MethodOverridingg();
		ap.customer(636);
		ap.customer("AJITH");
		ap.customer(30081996, 4567.9);
		
		
	}		
		
}		
	
	


package org.inheritance;

public class classB extends classA{
	
	private void company() {
		System.out.println("Iam a Company");
		
		
	}
	public static void main(String[]args) {
		classB cb=new classB();
		cb.company();
		cb.student();
		cb.staff();
		
		
	}
	

}

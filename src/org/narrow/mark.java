package org.narrow;

public class mark {
	public void b() {
		double d=94.2;
		int i=(int)d;
		short s=(short)i;
		
		
		
		System.out.println("Before Calaculation;" +d);
		System.out.println("After Calaculation To Int;" +i);
		System.out.println("After Calculation To Short;" +s);
		
	}
	public static void main(String[]args) {
		mark m=new mark();
		m.b();
	}
		
	

}

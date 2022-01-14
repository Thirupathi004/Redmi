package org.String;

public class Immutable {

	public static void main(String[] args) {
		
		String k = "Airlines";
		String k1 = "Airlines";
		
		int a = k.hashCode();
		System.out.println("String1:+" +a);
		
		int b = k1.hashCode();
		System.out.println("String2:+" +b);
		
		String k2 = k+k1;
		
		int c = k2.hashCode();
		System.out.println("Concatenated String:"+c);
		

	}

}

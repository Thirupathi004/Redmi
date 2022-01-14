package org.String;

public class StringRule {

	public static void main(String[] args) {
		
		String s = "Evening";
		String s1 = "Evening";
		
		StringBuffer fs = new StringBuffer(s);
		StringBuffer ss = new StringBuffer(s1);
		 int a = fs.hashCode();
		 System.out.println("String s: "+s+":" +a);
		 
		 int b = ss.hashCode();
		 System.out.println("String s1: "+s1+": "+b);
		 
		 StringBuffer gs = new StringBuffer();
		              
		             gs = fs.append(ss);
		             
		             int c = gs.hashCode();
		             System.out.println("Concatenated String:" +gs+":"+c);
		             
		              
		              
		              
		

	}

}

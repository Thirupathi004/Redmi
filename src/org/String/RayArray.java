package org.String;

public class RayArray {

	public static void main(String[] args) {
		String s= "ASHOK LEYLAND";
		String s1= "Spare";
		String s2 = "Best of Ashok Leyland";
		boolean a = s.equals(s1);
		System.out.println(a);
		boolean b = s.equalsIgnoreCase(s1);
		System.out.println(b);
		String c = s.toUpperCase();
		System.out.println(c);
		String d = s.toLowerCase();
		System.out.println(d);
		boolean e = s.startsWith("A");
		System.out.println(e);
		boolean f = s.endsWith("d");
		System.out.println(f);
		boolean g = s.contains("S");
		System.out.println(g);
		int h = s.indexOf("K");
		System.out.println(h);
		int i = s.lastIndexOf("D");
		System.out.println(i);
		char j = s.charAt(8);
		System.out.println(j);
		boolean k = s.isEmpty();
		System.out.println(k);
		String l = s.replace("A", "%%");
		System.out.println(l);
		String m = s.trim();
		System.out.println(m);
		int n = s.compareTo(s1);
		System.out.println(n);
		String o = s.substring(3,8);
		System.out.println(o);
		
		
		

	}

}

package org.Collection;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Object> z = new ArrayList<Object>();
		z.add(100);
		z.add(678);
		z.add("MECH");
		z.add(56.32f);
		z.add(998745623);
		z.add(true);
		z.add("k");
		System.out.println(z);
		
		int a = z.size();
		System.out.println(a); 
		
		Object b = z.get(3);
		System.out.println(b);
		
		z.set(4, 'T');
		System.out.println(z);
		
		z.remove(5);
		System.out.println(z);
		
		Object d = z.get(1);
		System.out.println(d);
		
		int e = z.indexOf(678);
		System.out.println(e);
		
		boolean f = z.contains("MECH");
		System.out.println(f);
		
		boolean g = z.isEmpty();
		System.out.println(g);
		
		z.clear();
		System.out.println(z);
		
		boolean h = z.isEmpty();
		System.out.println(h);
		

	}

}

package org.Set;
import java.util.TreeSet;
import java.util.Set;

public class DanProgram {

	public static void main(String[] args) {
		
		Set<Object> n = new TreeSet<Object>();
		n.add(200);
		n.add(90);
		n.add(76);
		n.add(560);
		n.add("Rock");
		n.add(67.89f);
		n.add(456.78);
		n.add(true);
		n.add('y');
		n.add(998456703);
		
		System.out.println(n);
		
		int a = n.size();
		System.out.println(n);
		n.remove(8);
		System.out.println(n);
		boolean b = n.contains("Rock");
		System.out.println(b);
		boolean c = n.isEmpty();
		System.out.println(c);
		n.clear();
		System.out.println(n);
			
		
			

	}

}

package org.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperPrograms {

	public static void main(String[] args) {
		List<Integer> m = new ArrayList<Integer>();
		
		m.add(560);
		m.add(453);
		m.add(800);
		m.add(250);
		m.add(500);
		m.add(345);
		
		Collections.sort(m);
		System.out.println(m);
		
		Collections.reverse(m);
		System.out.println(m);
	

	}

}

package org.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Victory {

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
	 
	List <Object> z1 = new Vector <Object>();
	z1.add(750);
	z1.add(100);
	z1.add("MACHI");
	z1.add(56.32f);
	z1.add(130);
	System.out.println(z1);

	z.addAll(z1);
	System.out.println(z);
	
	z.retainAll(z1);
	System.out.println(z);
	
	z.removeAll(z1);
	System.out.println(z);
	System.out.println(z1);
	
	boolean k = z.equals(z1);
	System.out.println(z);
		

	}

}

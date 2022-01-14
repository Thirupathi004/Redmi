package org.ArrayProgram;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapProgram {

	public static void main(String[] args) {
	
		Map<Object,Object> m = new HashMap<Object,Object>();
		
		m.put(1, "Hello");
		m.put(2, 10);
		m.put(5, "Welcome");
		m.put("name", "Java");
		m.put(6, 89.90);
		m.put(5, 100.8);
		m.put(10, "Hello");
		m.put(15, "null");
		m.put("null", "null");
		m.put("null", 30);
		m.put(20, "null");
		System.out.println(m);
		
		int a = m.size();
		System.out.println(a);
		Object b = m.get(6);
		System.out.println(b);
		Object c = m.keySet();
		System.out.println(c);
		Object d = m.values();
		System.out.println(d);
		boolean e = m.containsKey(70);
		System.out.println(e);
		boolean f = m.containsValue("Java");
		System.out.println(f);
		
		Set g = m.entrySet();
		System.out.println(g);
		
		
	
		
		

	}

}

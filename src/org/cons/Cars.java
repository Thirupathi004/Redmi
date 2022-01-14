package org.cons;

public class Cars {
	
	public Cars() {
		this(636);
		System.out.println("DEFAULT SHOWROOM");
	}
	public Cars(int a) {
		this("BMW");
		System.out.println("Register No:" +a);
	}
	public Cars(String b) {
		this(458912.1);
		System.out.println("Name:" +b);
	}
	public Cars(double c) {
		this(98.8f);
		System.out.println("Chasis Number:" +c);
	}
	public Cars(float d) {
		this('w');
		System.out.println("Tank Capacity:" +d);
	}
	public Cars(char g) {
		System.out.println("Brand:" +g);
	}
	public static void main(String[] args) {
		Cars vv =new Cars ();
		

		

	}

}

		
	
		
	

	
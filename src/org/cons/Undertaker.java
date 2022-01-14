package org.cons;

public class Undertaker { 
	
	public Undertaker() {
		System.out.println("DEFAULT UNDERTAKER");
		
	}
	public Undertaker (int weight) {
		System.out.println("WEIGHT:" +weight);
	}
	
	public Undertaker (String Game) {
		System.out.println("GAME:" +Game);
		
		
	}
	public static void main(String[] args) {
		Undertaker ko=new Undertaker();
		Undertaker ko1=new Undertaker(410);
		Undertaker ko2=new Undertaker("WWE");
	}
		
		
}		
		
	

	


	



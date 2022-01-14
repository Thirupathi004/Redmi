package org.Interface;

public class Cuboid implements Rectangle {

	int height=10;
	public void display() {
		
		System.out.println("CUBOID");
	}
	
	public void area() {
		
		double area=2*((length*breadth)+(breadth*height)+(length*height));
		System.out.println("Area of cuboid "+area);
	}
	
    public void perimeter() {
		
		double peri=4*(length+breadth+height);
		System.out.println("Perimeter of cuboid "+peri);
	}
    
    public void volume() {
		
		double vol=length*breadth*height;
		System.out.println("Volume of cuboid "+vol);
	}
	
    
    public static void main(String args[]) {
    	
    	Cuboid c= new Cuboid();
    	c.display();
    	c.area();
    	c.perimeter();
    	c.volume();
    	
    	
    }
}

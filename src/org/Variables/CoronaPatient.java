package org.Variables;

public class CoronaPatient {

	
	private String name = "Ajith";
	private int age=20;
	private String phno = "9789012001";
	double height=170.2;
	float weight=79.6f;
	char gender='M';
	
	private void displayPatientPersonalDetails(){
		System.out.println("\n\n----Patient's personal details----\n\n");
		System.out.println("Name -- "+name+"\nAge -- "+age+"\nPhone no -- "+phno+"\nHeight in cm -- "+height+
				"\nWeight in kg -- "+weight+"\nGender -- "+gender);
		
	}		
	public static void displayAwareness() {
		
		
		System.out.println("\n\n!!STAY HOME STAY SAFE!!!\n\n");
		System.out.println("\n1.Get Vaccinated\n2.Practice social distance\n3.Wash hands frequently");
	}	
		
	 public static void main(String arge[]) {
	    	
	    	CoronaPatient patient = new CoronaPatient();
	    	patient.displayPatientPersonalDetails();
	    	displayAwareness();
	 }
}
	    	
	    	
	    	
	    

	

	
	
	
	
	

	

   
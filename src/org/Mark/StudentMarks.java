package org.Mark;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("KCS HR SEC SCHOOL:");
		System.out.println("ENTER THE MARK IN TAMIL:");
		int tamilMarks =sc.nextInt();
		System.out.println("ENTER THE MARK IN ENGLISH:");
		int englishMarks = sc.nextInt();
		System.out.println("ENTER THE MARK IN BOTANY:");
		int botanyMarks = sc.nextInt();
		System.out.println("ENTER THE MARK IN ZIOLOGY:");
		int zoologyMarks = sc.nextInt();
		System.out.println("ENTER THE MARK IN MATHS:");
		int mathsMarks = sc.nextInt();
		float totalMarks=tamilMarks+englishMarks+botanyMarks+zoologyMarks+mathsMarks;
		float ave =totalMarks/5;
		System.out.println("AVERAGE:" +ave);
		
		
		if(ave >=90)
		{
			System.out.println("YOUR GRADE IS: A grade");
		}
		
		else if(ave>=80 && ave<90)
		{
			System.out.println("YOUR GRADE IS : B grade");
			
		}
		
		else if(ave >=70 && ave<80)
		{
			System.out.println("YOUR GRADE IS : C Grade");
			
		}
		
		else if(ave >=60 && ave<70)
		{
			System.out.println("YOUR GRADE IS:D Grade");
			
		}
		else if(ave>=35 && ave<60)
		{
			System.out.println("YOUR GRADE IS:E Grade");
			
		}
		else if(ave <35)
		{	
			System.out.println("YOUR GRADE IS: Fail");
					
		}
		
		
		
		
		
		
		}

}

package org.DecisionMaking;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String args[]) {
		
		int a,b;char op;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter operater(+,-,*,/)");
		op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+':
		      System.out.println("Addition of two no "+(a+b));
		      break;
		case '-':
		      System.out.println("Subtraction of two no "+(a-b));
		      break;
		      
			case '*':
			      System.out.println("Multiplication of two no "+(a*b));
			      break;
			    
			case '/':
			      System.out.println("Division of two no "+(a/b));
			      break;
			    
			default:
				System.out.println("Invalid character");
				
				
				
			}	
				
				
		}		
				
				
	}			
			
		
			
			
			
		


		
	
		
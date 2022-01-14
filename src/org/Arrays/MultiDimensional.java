package org.Arrays;

public class MultiDimensional {

	public static void main(String[] args) {
		int a[][]= {{4,5},{6,7}};
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
				
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		int b[][]= {{8,9},{10,11}};
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
			 
			System.out.print(b[i][j]+"  ");
			}
			
			System.out.println();
			
		}
		System.out.println();
		
        for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
			 
			System.out.print(a[i][j]+b[i][j]+"  ");
			}
			
			System.out.println();
			
		}
		
	   

	}

}

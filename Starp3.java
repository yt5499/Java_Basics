package myproject1;

import java.util.Scanner;

public class Starp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of lines for star: ");
		
		int n=sc.nextInt();
		
/*		- - - - *      n=5
		- - - * *
		- - * * *
		- * * * *
		* * * * *      */
		
		for(int i=0;i<n;i++) {
			for(int k=n-1-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}

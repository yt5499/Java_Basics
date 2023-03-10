package myproject1;

import java.util.Scanner;

public class Starp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		i=row & j=column
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of lines for star: ");
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}

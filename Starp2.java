package myproject1;

import java.util.Scanner;

public class Starp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of lines for star: ");
		
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}

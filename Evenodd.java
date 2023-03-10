package myproject1;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number\n");
		
		int num=sc.nextInt();
		System.out.println("your number is: "+num);
		
//		is number even or odd
		if(num%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}

	}

}

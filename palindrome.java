package myproject1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number\n");
		
		int num=sc.nextInt();
		System.out.println("your number is: "+num);
		
		int a=num;
		
//		first reverse a number
		
		int rev=0;
		while(num!=0) {
			
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("your reverse number is: "+rev);
		
//		checking palindrome or not
		if(rev==a) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome");
		}

	}

}

package myproject1;

import java.util.Scanner;

public class palindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string\n");
		
		String str=sc.nextLine();
		System.out.println("your string is: "+str);
		
		String s= str;
		
//		first reverse a string
		int len=str.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("reverse string is: "+rev);
		
		
		if(s.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not a Palindrome");
		}

	}

}

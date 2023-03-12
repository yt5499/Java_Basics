package Java_Fundamental;

import java.util.Scanner;

public class SwapStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String s1 = sc.next();
		System.out.println("Enter second string: ");
		String s2 = sc.next();
		
//		display strings before swap
		System.out.println("Your string before swap s1 = "+s1+" s2 = "+s2);
		System.out.println();
		
//		swap the strings
		String temp=s1;
		s1=s2;
		s2=temp;
		
//		display string after swap
		System.out.println("Your string before swap s1 = "+s1+" s2 = "+s2);

	}

}

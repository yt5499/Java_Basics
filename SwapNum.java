//	swapping of two numbers by uding third variable

package Java_Fundamental;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
//		display numbers before swapping
		System.out.println("So your numbers before swaps are: a = "+a+" b = "+b);
		System.out.println();
		
//		now swap the numbers
		int temp = a;
		a=b;
		b=temp;
		
//		display numbers after swapping
		System.out.println("So your numbers after swap are: a = "+a+" b = "+b);

	}

}

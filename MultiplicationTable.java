package practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for which you want table ");
		int num = sc.nextInt();
		
		int i=1;
		while(i<=10) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			i++;
		}

	}

}

package myproject1;

import java.util.Scanner;

public class digitsinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number\n");
		
		int num=sc.nextInt();
		System.out.println("your number is: "+num);
		
//		checking digits in number
		int c=0;
		int d=0;
		while(num!=0) {
			d=num%10;
			c+=1;
			num=num/10;
		}
		System.out.println("Total digits: "+c);

	}

}

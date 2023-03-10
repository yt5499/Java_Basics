package myproject1;

import java.util.Scanner;

public class countEvenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number\n");
		
		int num=sc.nextInt();
		System.out.println("your number is: "+num);
		
		int n= num;
		
//		number of even odd digits
		int even_d=0;
		int odd_d=0;
		while(num!=0) {
			int d=num%10;
			if(d%2==0) {
				even_d+=1;
			}
			else {
				odd_d+=1;
			}
			num=num/10;
			
		}
		System.out.println("Even digits= "+even_d+" "+"Odd digits= "+odd_d);
		
	}

}

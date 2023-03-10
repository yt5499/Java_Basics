package myproject1;
import java.util.*;

public class Reverses {

	public static void main(String[] args) {
		
		Scanner num= new Scanner(System.in);
		System.out.println("Enter number\n");
		
		int a=num.nextInt();
		
		System.out.println("Your number is: "+a);
		
//		reversing a number
		int rev=0;
		
		while(a!=0) {
			
			rev=rev*10 + a%10;
			a=a/10;
		}
		System.out.println("Reverse: "+rev);

	}

}

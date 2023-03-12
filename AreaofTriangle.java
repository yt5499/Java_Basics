package Java_Fundamental;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter altitude(height): ");
		Double h = sc.nextDouble();
		System.out.println("Enter base: ");
		Double b = sc.nextDouble();
		
		System.out.println("You entered:");
		System.out.println("Height = "+h+" Base = "+b);
		System.out.println();
		
//		find area of triangle formula = (h*b)/2
		Double aot = (h*b)/2;
		
//		print area of triangle
		System.out.printf("Area of triangle = %.3f",aot);		//	here print output with 3 decimal places use printf on println
		
	}

}

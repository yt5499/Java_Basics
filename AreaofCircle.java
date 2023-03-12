//formula to find area of circle = pi.r**2

package Java_Fundamental;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius ");
		Double r = sc.nextDouble();
		
		Double radius = r;
		final Double pi = 3.14159;
		
		Double aoc = pi * r * r; 
		System.out.println("Therefore Area of Circle is: "+aoc);
				
	}

}

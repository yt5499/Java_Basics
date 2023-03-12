//	in this code we will add nos by taking input from command line arguments
//	this code should be compiled on cmd prompt

package Java_Fundamental;

public class Sum {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int sum = n1 + n2;
		
		System.out.println("Your sum is: "+sum);

	}

}

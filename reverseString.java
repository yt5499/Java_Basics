package myproject1;

import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string\n");
		
		String st=sc.nextLine();
		System.out.println("your string is: "+st);
		
//		reversing a string
		String rev="";
		int len=st.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev+=st.charAt(i);
		}
		System.out.println("reversed string is: "+rev);

	}

}

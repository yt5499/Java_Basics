package practice;

// Finding largest of three elements
// First way

// class name has been spelled wrong, sorry for that
public class LargetofThree {

	public static void main(String[] args) {
		
		double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        	if( n1 >= n2 && n1 >= n3)
            		System.out.println(n1 + " is the largest number.");

        	else if (n2 >= n1 && n2 >= n3)
            		System.out.println(n2 + " is the largest number.");

        	else
            		System.out.println(n3 + " is the largest number.");        
		
		
// 		Another way
		
		double[] num = {-4.5,3.9,2.5};
        
        	double large = num[0];				//declaring outside the loop
        
        	for(int i=1;i<num.length;i++) {
        		if(large<num[i]) {
        			large = num[i];
        		}
        	}
        	System.out.println("The largest element is: "+large);

	}

}

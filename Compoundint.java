//	this code is under construction, so please don't blame
//	you can suggest(help) me for this, if you have any other idea


//	here we will find compound interest
/*		A = amount
		P = principal 
		r = rate of interest
		n = number of times interest is compounded per year
		t = time (in years)
		*/
/*A = Accrued amount (principal + interest)
P = Principal amount
r = R/100
n = number of compounding periods per unit of time  (monthly)
t = time in decimal years; e.g., 6 months is calculated as 0.5 years. 

*/

package Java_Fundamental;

public class Compoundint {
	
	public static void main(String[] args) {
		
		double p = 10000;
		double r = 4.5;
//		double n = 12;
		double t = 7.5;
		
		double a = p * Math.pow((1 + r/100), t) ;
		System.out.printf("Compound interest = %.3f",a);
		
	}
}
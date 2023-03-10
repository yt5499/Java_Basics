package myproject1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		logic1
		int a=20;
		int b=40;
		
		System.out.println("before swap"+" "+a+" & "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap"+" "+a+" & "+b);
		
//		logic2
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap. logic2"+" "+a+" & "+b);

	}

}

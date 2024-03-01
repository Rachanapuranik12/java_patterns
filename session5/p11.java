/*WAP to print addition of factorials of two given numbers from user.
 */

import java.util.*;
class P11{
	static void fun(int n1,int n2){

		int fact1=1;
		int fact2=1;
		int add=0;
		int t1=n1;
		int t2=n2;

		int i1=1;
		while(i1<=n1){
			fact1=fact1*n1;
			n1--;
		}
		int ans1=fact1;

		int i2=1;
		while(i2<=n2){
			fact2=fact2*n2;
			n2--;
		}
		int ans2=fact2;

		add = ans1+ans2;

		System.out.println("Addition of factorial of "+t1+" and "+t2+" is "+add);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int n1=sc.nextInt();

		System.out.println("Enter number2");
		int n2=sc.nextInt();

		fun(n1,n2);
	}
}




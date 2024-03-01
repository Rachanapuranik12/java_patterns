/* WAP to print factorial of number in given range
 * i/p:- start = 1, end = 5.
 * factorial of 1=1, factorial of 2=2, factorial of 3=6, factorial of 4=24, factorial of 5=120.
 */

class P12{

	static void fact(int s, int e){

		for(int i=s;i<=e;i++){

			int temp=i;
			int fact=1;
			while(temp>=1){
				fact=fact*temp;
				temp--;
			}
			System.out.println("Factorial of "+i+" is "+fact);
		}
	}

	public static void main(String[] args){
		fact(1,5);
	}
}

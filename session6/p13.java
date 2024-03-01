/* WAP to print the numbers whose factorial is even.Take range from user.
 * i/p:- start 1 end 5
 * o/p:- 2 3 4 5
 */

class P13{
	static void fun(int s,int e){

		int fact=1;
		int k=1;

		for(int i=s;i<=e;i++){
			int n=i;
			while(k<=n){
				fact=fact*n;
				n--;
			}

			if(fact%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args){
		fun(1,10);
	}
}





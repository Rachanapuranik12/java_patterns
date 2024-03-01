/* 	4
 *    3 6
 *  2 4 6
 *1 2 3 4
 */

class P9{

	static void fun(int n){

		int x=n;

	for(int i=1;i<=n;i++){

		for(int j=n;j>i;j--){
			System.out.print("  ");
		}
		int temp=x;
		int k=1;

		for(int j=1;j<=i;j++){
			System.out.print(temp+" ");
			temp=temp+i+k-n;
		
		}

		x--;
		k++;
		System.out.println();
	}
	}
	public static void main(String[] args){
		fun(4);
	}
}



		

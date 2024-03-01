/*7 6 5 4 3 2 1
 *  5 4 3 2 1
 *    3 2 1
 *      1
 */

class P11{
	static void fun(int n){
		int temp=n;
		int x=7;
		
		for(int i=1;i<=n;i++){
			
			int t=x;
			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=temp*2-1;j++){
				System.out.print(t+" ");
				t--;
			}

			temp--;
			x=x-2;
			System.out.println();

		}
	}
	public static void main(String[] args){
		fun(4);
	}
}



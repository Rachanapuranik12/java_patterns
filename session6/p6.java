/* 1 2 3 4
 *   2 3 4
 *     3 4
 *       4
 */

class P6{
	static void fun(int n){
		int x=1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			

			for(int j=n;j>=i;j--){
				System.out.print(x+" ");
				x++;
			}
			x=i+1;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}

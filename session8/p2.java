/*   1 2 3 4 5
 *     6 7 8
 *       9
 */

class P2{
	static void fun(int n){
		int temp=n;
		int x=1;
		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}


			for(int j=1;j<=temp*2-1;j++){
				System.out.print(x+" ");
				x++;
			}
			temp--;
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(3);
	}
}


/*    1
 *   2 2
 *  3 3 3
 * 4 4 4 4 
 *5 5 5 5 5
 */


class numberpyramid{
	static void fun(int n){

		int x=1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
			}
			x++;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(5);
	}
}

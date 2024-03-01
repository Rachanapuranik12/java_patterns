/* 4 3 2 1
 *   3 2 1
 *     2 1
 *       1
 */


class P7{
	static void fun(int n){

		int x=n;
	

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			int temp=x;
			for(int j=n;j>=i;j--){
				System.out.print(temp+" ");
				temp--;
			}

			x--;
			System.out.println();

		}
	}
	public static void main(String[] args){
		fun(4);
	}
}
			

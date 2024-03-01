/* 4 3 2 1
 * 3 2 1
 * 2 1
 * 1
 */


class P4{
	static void fun(int n){

		int x=n;

		for(int i=1;i<=n;i++){
			
			for(int j=n;j>=i;j--){
				System.out.print(x+" ");
				x--;
			}
			x=n-i;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}

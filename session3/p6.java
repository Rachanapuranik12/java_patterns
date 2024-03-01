/* 4
 * 3 3
 * 2 2 2
 * 1 1 1 1
 */


class P6{
	static void fun(int n){

		int x=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
			}
			x--;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}



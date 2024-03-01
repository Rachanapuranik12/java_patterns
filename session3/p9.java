/* 3
 * 6 9
 * 12 15 18
 *
 * rows=4
 * 4
 * 8 12
 * 16 20 24
 * 28 32 36 40
 */


class P9{
	static void fun(int n){

		int x=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
				x=x+n;
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}



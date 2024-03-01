/* 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 */


class P8{
	static void fun(int n){

		int x;
		for(int i=1;i<=n;i++){
			x=i;
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
				x=x+i;
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}



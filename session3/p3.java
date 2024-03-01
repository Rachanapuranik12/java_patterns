/* 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 */


class P3{
	static void fun(int n){

		for(int i=1;i<=n;i++){
			int x=i;
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}



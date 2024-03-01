/* 9 8 7
 * 6 5 4
 * 3 2 1
 */


class P6{
	static void fun(int n){

		int x=n*n;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(x+" ");
				x--;
			}
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

/* 1 2 3
 * 2 3 4
 * 3 4 5
 */


class P4{
	static void fun(int n){

		int x=1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(x+" ");
				x++;
			}
			x=i+1;
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

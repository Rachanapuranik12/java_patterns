/* 1 1 1
 * 2 2 2
 * 3 3 3
 */


class P4{
	static void fun(int n){

		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

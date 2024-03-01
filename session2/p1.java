/* 1  4  7
 * 10 13 16
 * 19 22  25
 */


class P1{
	static void fun(int n){
		
		int x=1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(x+"\t");
				x=x+n;
			}
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

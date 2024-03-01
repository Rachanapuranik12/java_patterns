/* 9  64  7
 * 36 5   16
 * 3  4    1
 */


class P6{
	static void fun(int n){

		int x=n*n;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(x%2==0){

				System.out.print(x*x+"\t");
				x--;
				}else{
				    System.out.print(x+"\t");
				    x--;
				}
			}
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

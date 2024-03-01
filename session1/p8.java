/* 1  3  5
 * 7  9  11
 * 13 15 17
 */


class P8{
	static void fun(int n){

		int x=1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(x+"\t");
				x=x+2;
			}
			
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

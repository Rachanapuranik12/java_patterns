/* d d d d
 * c c c c
 * b b b b 
 * a a a a
 */


class P2{
	static void fun(int n){

		char ch='d';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(ch+" ");
			}
			ch--;
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(4);
}
}

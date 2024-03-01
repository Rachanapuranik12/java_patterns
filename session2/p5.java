/* D D D D
 * C C C C
 * B B B B
 * A A A A
 */


class P5{
	static void fun(int n){

		char ch='D';

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

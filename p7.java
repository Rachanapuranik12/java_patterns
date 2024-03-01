/* 	a
 *    a b c
 *  a b c d e 
 *a b c d e f g
 */

class P7{
	static void fun(int n){

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}

			char ch='a';

			for(int j=1;j<=2*i-1;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
public static void main(String[] args){
	fun(4);
}
}

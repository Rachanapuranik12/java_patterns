/* d d d d
 *   c c c
 *     b b
 *       a
 * rows = 4
 */

class P4{
	static void fun(int n){

		int ch=97+n-1;

		for(int i=1;i<=n;i++){

		for(int j=1;j<i;j++){
			System.out.print("  ");
		}


		for(int j=n;j>=i;j--){
			System.out.print((char)ch+" ");
		}
		
	ch--;
	System.out.println();
		}
	}
public static void main(String[] args){
	fun(4);
}
}



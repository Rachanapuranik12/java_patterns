/*    		d
 *           c  c  c
 *        b  b  b  b  b
 *     a  a  a  a  a  a  a
 */

class P5{
	static void fun(int n){

		char ch='d';
		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}

			for(int j=1;j<=2*i-1;j++){
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

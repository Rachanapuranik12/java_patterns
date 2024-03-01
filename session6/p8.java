/* D D D D
 *   c c c
 *     B B
 *       a
 */

class P8{
	static void fun(int n){

		char ch='D';
		char ch1='d';

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			for(int j=n;j>=i;j--){
				if(i%2==0){
					System.out.print(ch1+" ");
					
				}else{
					System.out.print(ch+" ");
					
				}
			}
			ch1--;
			ch--;
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


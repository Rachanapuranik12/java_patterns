/*  * * * # * * *
 *    * * # * *
 *      * # *
 *        #
 */

class P10{
	static void fun(int n){

		int temp=n;
		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=temp*2-1;j++){
				if(j==n-i+1){
					System.out.print("# ");
				}else{
					System.out.print("* ");
				}
			}
			temp--;
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

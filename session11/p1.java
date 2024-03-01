/*       *
 *     * * *
 *   * * * * *
 * * * * * * * *
 *   * * * * *
 *     * * *
 *       *
 */

class P1{
	static void fun(int n){
		int cols,space;
		int temp=n-1;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=2*i-1;
				space=n-i;
			}else{
				cols=temp*2-1;
				space=i-n;
				temp--;
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=cols;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

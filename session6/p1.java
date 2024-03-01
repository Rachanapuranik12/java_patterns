/* rows =3
 *   * * * *
 *     * * *
 *       * *
 *         *
 */

class P1{
	static void fun(int rows){

		for(int i=1;i<=rows+1;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			for(int j=rows+1;j>=i;j--){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(3);
	}
}




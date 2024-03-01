/* 	1
 *    4 7
 *10 13 16
 * rows = 4
 *     	    1
 *      5    9
 *  13  17  21
 *25 29 33  37
 */


class P4{
	static void fun(int n){

		int x=1;
		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("\t");
			}
			
			
			for(int j=1;j<=i;j++){
				System.out.print(x+"\t");
				x=x+n;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

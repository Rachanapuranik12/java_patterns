/*          1
 *        2 1
 *      3 2 1
 *    4 3 2 1
 *      3 2 1
 *        2 1
 *          1
 */

class P3{
	static void fun(int n){
		int cols,space;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=i;
				space=n-i;
			}else{
				cols=2*n-i;
				space=i-n;
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}

			int x=cols;
			for(int j=1;j<=cols;j++){
				System.out.print(x+" ");
				x--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


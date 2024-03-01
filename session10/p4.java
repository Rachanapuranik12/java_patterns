/*       4
 *     3 3
 *   2 2 2
 * 1 1 1 1
 *   2 2 2
 *     3 3
 *       4
 */

class P4{
	static void fun(int n){
		int cols,space;
		int x=n+1;

		for(int i=1;i<=2*n-1;i++){
			
			if(i<=n){
				cols=i;
				space=n-i;
				x--;
			}else{
				cols=2*n-i;
				space=i-n;
				x++;
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=cols;j++){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	
	}
	public static void main(String[] args){
		fun(4);
	}
}




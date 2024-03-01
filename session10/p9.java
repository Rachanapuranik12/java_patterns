/*           1
 *         1 2
 *       2 3 4
 *     4 5 6 7
 *       7 8 9
 *         9 10
 *           10
 */
 
class P9{
	static void fun(int n){
		int cols,space;

		int x=1;
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

			for(int j=1;j<=cols;j++){
				System.out.print(x+" ");
				x++;
			}

			System.out.println();
			x--;
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


/* 4
 * 3 3
 * 2 2 2
 * 1 1 1 1
 * 2 2 2
 * 3 3
 * 4
 */

class P4{
	static void fun(int n){
		int cols;
		int x=n;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=i;
			}else{
				cols=2*n-i;
			}

			for(int j=1;j<=cols;j++){
				System.out.print(x+" ");
			}

			if(i<n){
			x--;
			}else{
				x++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


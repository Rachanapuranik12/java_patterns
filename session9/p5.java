/* 3
 * 2 3
 * 1 2 3
 * 0 1 2 3
 * 1 2 3
 * 2 3
 * 3
 */

class P5{
	static void fun(int n){
		int cols;
		int x=n-1;
		//int t=x;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=i;
			}else{
				cols=2*n-i;
			}
			int t=x;

			for(int j=1;j<=cols;j++){
				System.out.print(t+" ");
				t++;
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


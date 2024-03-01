/* 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 3 2 1
 * 2 1
 * 1
 */

class P3{
	static void fun(int n){
		int cols;
		int x=1;

		for(int i=1;i<=n*2-1;i++){
			if(i<=n){
				cols=i;
			}else{
				cols=2*n-i;
			}
			int t=cols;

			for(int j=1;j<=cols;j++){
				System.out.print(t+" ");
				t--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}



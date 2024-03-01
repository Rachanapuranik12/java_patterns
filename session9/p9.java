/* 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 * 3 6 9
 * 2 4
 * 1
 */

class P9{
	static void fun(int n){

		int x=1;
		int cols;

		for(int i=1;i<=n*2-1;i++){
			if(i<=n){
				cols=i;
			}else{
				cols=n*2-i;
			}

			int t=x;

			for(int j=1;j<=cols;j++){
				System.out.print(t+" ");
				t=t+cols;
			}

			if(i<n){
				x++;
			}else{
				x--;
			}
			System.out.println();
	}
	}

			


	public static void main(String[] args){
		fun(4);
	}
}


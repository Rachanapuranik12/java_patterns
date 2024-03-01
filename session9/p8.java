/* 1
 * 3 2 1
 * 5 4 3 2 1
 * 3 2 1
 * 1
 */

class P8{
	static void fun(int n){
		int cols;
		int x=1;

		int p=1;
		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=i+1;
				if(i==1){
					cols=i;
				}
			}else{
				cols=2*n-i+2;
			
			}
			

			int t=x;
			for(int j=1;j<=cols;j++){
				System.out.print(t+" ");
				t--;
			}

			if(i<n){
				x=x+2;
			}else{
				x=x-2;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(3);
	}
}

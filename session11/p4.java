/*      1
 *    2 1 2
 *  3 2 1 2 3
 *4 3 2 1 2 3 4
 *  3 2 1 2 3
 *    2 1 2
 *      1
 */


class P4{
	static void fun(int n){
		int cols,space;
		int temp=n-1;

		int x=0;
		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=2*i-1;
				space=n-i;
				x++;
			}else{
				cols=temp*2-1;
				space=i-n;
				temp--;
				x--;
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			int t=x;

				
			for(int j=1;j<=cols;j++){
				if(j<(cols+1)/2){

				System.out.print(t+" ");
				t--;
				}else{
					System.out.print(t+" ");
					t++;
				}
			
			
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


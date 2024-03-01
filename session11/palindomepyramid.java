/*        1
 *      2 1 2
 *    3 2 1 2 3
 *  4 3 2 1 2 3 4
 *5 4 3 2 1 2 3 4 5
 */


class palindromepyramid{
	static void fun(int n){

		int x=1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n-i;j++){

				System.out.print("  ");
			}
			int t=x;

			for(int j=1;j<=2*i-1;j++){
			
				if(j<i){
					System.out.print(t+" ");
					t--;
				}else{
					System.out.print(t+" ");
					t++;
				}
			}

			System.out.println();
			x++;
		}
	}
	public static void main(String[] args){
		fun(5);
	}
}


 

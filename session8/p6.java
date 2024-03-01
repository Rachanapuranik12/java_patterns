 /* 1 2 3 4 3 2 1
 *    1 2 3 2 1
 *     1 2 1
 *       1
 */

class P6{
	static void fun(int n){
		int temp=n;
	
			for(int i=1;i<=n;i++){

				for(int j=1;j<i;j++){
					System.out.print("  ");
				}

				int x=1;
				for(int j=1;j<=temp*2-1;j++){
					if(j<n-i+1){
						System.out.print(x+" ");
						x++;
					}else{
						System.out.print(x+" ");
						x--;
					}
				}
				
				temp--;
				System.out.println();
			}
	}
	public static void main(String[] args){
		fun(4);
	}
}




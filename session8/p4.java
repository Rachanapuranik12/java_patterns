/* 1 2 3 4 3 2 1
 *   2 3 4 3 2
 *     3 4 3
 *       4
 */

class P4{
	static void fun(int n){
		int temp=n;
		int x=1;
			for(int i=1;i<=n;i++){

				for(int j=1;j<i;j++){
					System.out.print("  ");
				}
				
				for(int j=1;j<=temp*2-1;j++){
					if(j<n-i+1){
						System.out.print(x+" ");
						x++;
					}else{
						System.out.print(x+" ");
						x--;
					}
				}
				//x=i+1;
				x=x+2;
				temp--;
				System.out.println();
			}
	}
	public static void main(String[] args){
		fun(4);
	}
}




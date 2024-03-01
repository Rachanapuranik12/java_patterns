/*    		5
 *           5  6  5
 *        5  4  3  4  5
 *     5  6  7  8  7  6  5
 *  5  4  3  2  1  2  3  4  5
 */

class P9{

	static void fun(int n){

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}

			int x=n;
			for(int j=1;j<=2*i-1;j++){
				if(i%2!=0){
					if(j<i){
						System.out.print(x+" ");
						x--;
					}else{
						System.out.print(x+" ");
						x++;
					}
				}else{
					if(j<i){
						System.out.print(x+" ");
						x++;
					}else{
						System.out.print(x+" ");
						x--;
					}
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(5);
	}
}



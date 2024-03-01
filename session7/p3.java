/*   		1
 *           1  2  1
 *        1  2  3  2  1
 *     1  2  3  4  3  2  1
 */

class P3{
	static void fun(int n){

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}
			
			int x=1;

			for(int j=1;j<=2*i-1;j++){
				if(j<i){
					System.out.print(x+" ");
					x++;
				}else{
					System.out.print(x+" ");
					x--;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

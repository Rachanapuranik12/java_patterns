/*        5
 *      5 6
 *    5 4 3
 *  5 6 7 8
 *5 4 3 2 1
 */


class P6{
	static void fun(int n){

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}
			
			int x=n;
			for(int j=1;j<=i;j++){
				if(i%2==0){
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
		fun(5);
	}
}

			

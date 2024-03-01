/* 1 2 3 4
 * 4 5 6
 * 6 7
 * 7
 */


class P10{
	
	static void fun(int n){

		int x=1;

	
		for(int i=1;i<=n;i++){
			
				for(int j=n;j>=i;j--){

				System.out.print(x+" ");
				x++;
				
	
			}
			
			x--;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}

/* 4 3 2 1
 * 4 3 2
 * 4 3
 * 4
 */


class P11{
	
	static void fun(int n){


		int x=n;

	
		for(int i=1;i<=n;i++){
			
				for(int j=n;j>=i;j--){

				System.out.print(x+" ");
				x--;
				
	
			}
			
			x=n;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}

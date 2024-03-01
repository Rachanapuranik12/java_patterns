/* 1 2 3 4 5
 * 2 3 4 5
 * 3 4 5
 * 4 5
 * 5
 */


class P6{
	
	static void fun(int n){
		int x=1;
		for(int i=1;i<=n;i++){
			x=i;
			//int x=1;
			for(int j=n;j>=i;j--){
				System.out.print(x+" ");
				x++;
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(5);
	}
}


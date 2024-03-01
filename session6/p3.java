/* 1 2 3 4
 *   1 2 3
 *     1 2
 *       1
 */


class P3{
	static void fun(int rows){

		for(int i=1;i<=rows+1;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}
			
			int x=1;
			for(int j=rows+1;j>=i;j--){
				System.out.print(x+" ");
				x++;
			}

			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(3);
	}
}

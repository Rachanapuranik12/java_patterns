/* 1 2 3 4
 *   5 6 7
 *     8 9
         10
*/



class P2{
	static void fun(int rows){

		int x=1;
		for(int i=1;i<=rows+1;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

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

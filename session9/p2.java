/*  1
 *  1 2
 *  1 2 3
 *  1 2 3 4
 *  1 2 3
 *  1 2
 *  1
 */

class P2{
	static void fun(int n){
		int cols;

		for(int i=1;i<=n*2-1;i++){

			if(i<=n){
				cols=i;
			}else{
				cols=2*n-i;
			}

			int x=1;
			for(int j=1;j<=cols;j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


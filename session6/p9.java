/* 100   9   64   7
 *      36    5   16
 *            3   4
 *                 1
 */


class P9{
	static void fun(int n){

		int x=10;

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("\t");
			}

			for(int j=n;j>=i;j--){
				if(x%2==0){
					System.out.print(x*x+"\t");
					x--;
				}else{
					System.out.print(x+"\t");
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


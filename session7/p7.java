/*  		1
 *           4  7  4
 *        7  10  13  10  7
 *   10  13  16  19  16  13  10
 */

class P7{
	static void fun(int n){

		int x=1;
		//int temp=x;

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("\t");
			}

			int temp=x;
			for(int j=1;j<=2*i-1;j++){
				if(j<i){
					System.out.print(temp+"\t");
					temp=temp+3;
				}else{
					System.out.print(temp+"\t");
					temp=temp-3;
				}
			}
			x=x+3;
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}



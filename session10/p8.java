/*          1
 *       1  4
 *    4  7 10
 *10 13 16 19
     19 22 25
        25 28
	   28
*/

class P8{

	static void fun(int n){
		int cols,space;

		int x=1;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=i;
				space=n-i;
				
			}else{
				cols=2*n-i;
				space=i-n;
		
			}

			for(int j=1;j<=space;j++){
				System.out.print("\t");
			}

			for(int j=1;j<=cols;j++){
				System.out.print(x+"\t");
				x=x+3;
			}
			x=x-3;
			System.out.println();
			//x=x+3;
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

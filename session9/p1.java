/*  *               //rows=4
 *  * *
 *  * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 */


class P1{
	static void fun(int n){

		int cols;

		for(int i=1;i<=n*2-1;i++){
			if(i<=n){
				cols=i;
			}else{
				cols=n*2-i;
			}

			for(int j=1;j<=cols;j++){
				System.out.print("* ");
			}
			System.out.println();
	}
	}

			


	public static void main(String[] args){
		fun(4);
	}
}



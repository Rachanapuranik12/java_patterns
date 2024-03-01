/* 1 3 5 7 9
 *   9 7 5 3
 *     3 5 7
 *       7 5
 *         5
 */


class P11{
	static void fun(int n){

		int x=1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("\t");
			}

			for(int j=n;j>=i;j--){
				if(i%2==0){
					System.out.print(x+"\t");
					x=x-2;
				}else{
					System.out.print(x+"\t");
					x=x+2;
				}
			}
					
		
			if(i%2!=0){
				x=x-2;
			}else{
				x=x+2;
			}
			

			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(5);
	}
}

/*      1
 *    1 2 1
 *  1 2 3 2 1
 *1 2 3 4 3 2 1
 *  1 2 3 2 1
 *    1 2 1
 *      1
 */

class P3{
	static void fun(int n){
		int cols,space;
		int temp=n-1;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=2*i-1;
				space=n-i;

			}else{
				cols=temp*2-1;
				space=i-n;
				temp--;
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=cols;j++){
				if(i<=n){

				if(j<i){
					System.out.print(x+" ");
					x++;
				}else{
					System.out.print(x+" ");
					x--;
				}

				}else{	

					if(j<2*n-i) {
				
					System.out.print(x1+" ");
					x1++;
				}else{
					System.out.print(x1+" ");
					x1--;
			}
					}
				}
				
		
			System.out.println();
		}
		
		}


	public static void main(String[] args){
		fun(4);
	}
}




/*  		4
 *           3  6  3
 *        2  4  6  4  2
 *    1   2  3  4  3  2  1
 *
 */

class P12{
	static void fun(int n){

			int x=n;

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}

			int temp=x;
			for(int j=1;j<=2*i-1;j++){
			
					if(i==1){
						System.out.print(temp+" ");
					}else if(i==2){
						System.out.print(temp+" ");
						if(j<i){
							temp=temp+3;
						}else{
                                           
							temp=temp-3;
						}
					}else if(i==3){

						System.out.print(temp+" ");
						if(j<i){
						temp=temp+2;
						}else{
						temp=temp-2;
						}
					}else{

						System.out.print(temp+" ");
						if(j<i){

							temp=temp+1;
						}else{
							temp=temp-1;
						}
					}


			}
			x--;
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


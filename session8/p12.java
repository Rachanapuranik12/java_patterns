/* 1 3 5 7 9 7 5 3 1
 *   9 7 5 3 5 7 9
 *     3 5 7 5 3
 *       7 5 7
 *         5
 */

class P12{
	static void fun(int n){
		int temp=n;
		int x=1;
		int x2=9;

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}


			int t1=x;
			int t2=x2;

			for(int j=1;j<=temp*2-1;j++){
				if(i%2==0){
					if(j<n-i+1){
						System.out.print(t2+" ");
						t2=t2-2;
					}else{
						System.out.print(t2+" ");
						t2=t2+2;
					
					}
		
				}else{
					if(j<n-i+1){
						System.out.print(t1+" ");
						t1=t1+2;
					}else{
						System.out.print(t1+" ");
						t1=t1-2;
					
					}
				}
			}
			x=i+1;
			x2=10-i;
			System.out.println();
			temp--;
		}
	}
	public static void main(String[] args){
		fun(5);
	}
}





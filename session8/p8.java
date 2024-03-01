/* D C B A B C D
 *   c b a b c
 *     B A B
 *       a
 */

class P8{
	static void fun(int n){
		int temp=n;
		int ch='D';
		int ch1='d';

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=temp*2-1;j++){
				if(i%2!=0){
				if(j<n-i+1){
					System.out.print((char)ch+" ");
					ch--;
				}else{
					System.out.print((char)ch+" ");
					ch++;
				}
				
			}else{
				if(j<n-i+1){
					System.out.print((char)ch1+" ");
					ch1--;
				}else{
					System.out.print((char)ch1+" ");
					ch1++;
				}
			}
			}
			ch=ch-i;
			ch1= ch1-1;
				
			temp--;
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		fun(4);
	}
}



 

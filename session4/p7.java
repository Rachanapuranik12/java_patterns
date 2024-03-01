/* d d d d
 * C C C
 * b b
 * A
 */


class P7{
	static void fun(int n){


		int ch = 97+n-1;
		//char ch='d';
		//char ch1='C';
		int ch1=65+n-1;

		for(int i=1;i<=n;i++){
			
			for(int j=n;j>=i;j--){
				if(i%2==0){

				System.out.print((char)ch1+" ");
				
				}else{
					System.out.print((char)ch+" ");
					
				}
			}
			ch--;
			ch1--;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}

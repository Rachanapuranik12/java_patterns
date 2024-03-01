/* D C B A
 * C B A
 * B A
 * A
 */


class P8{
	
	static void fun(int n){


		//int ch = 97+n-1;
		//char ch='d';
		//char ch1='C';
		int ch1=65+n-1;

	
		for(int i=1;i<=n;i++){
		
		int temp=ch1;	
				for(int j=n;j>=i;j--){

				System.out.print((char)temp+" ");
				temp--;
				
	
			}
			
			ch1--;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}

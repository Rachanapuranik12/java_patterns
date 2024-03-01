/* 4 3 2 1
 * C B A
 * 2 1
 * A
 */


class P9{
	
	static void fun(int n){

		int ch1=65+n-1;

		int x=n;

		for(int i=1;i<=n;i++){
		
		int temp=ch1;	

		int temp1=x;	
	
		for(int j=n;j>=i;j--){
				
			if(i%2==0){

				System.out.print((char)temp+" ");
				temp--;
				
	
			}else{
				System.out.print(temp1+" ");
				temp1--;
			}
		}
			x--;
			
			ch1--;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}

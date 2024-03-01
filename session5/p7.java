/* 		A
 *  	      b a
 *  	    C E G
 *  	  d c b a
 *  	E G I K M
 */


class P7{
	static void fun(int n){


		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}
			
			int ch=97+i-1;
			int ch1=65+i-1;

			for(int j=1;j<=i;j++){
				if(i%2==0){

				System.out.print((char)ch+" ");
				ch--;
			}else{
				System.out.print((char)ch1+" ");
				//ch1++;
				ch1++;
				ch1++;
			}
			
			}
			ch1--;

		
			System.out.println();
		
	}
	}
	public static void main(String[] args){
		fun(5);
	}
}

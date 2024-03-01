/*	D
 *    c D
 *  B c D
 *a B c D
 */


class P5{
	static void fun(int n){

		int ch = 65+n-1; //D
		int ch1= 97+n-1; //d

		int temp,temp1;
		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}
					
			 temp=ch;
			 temp1=ch1;

			for(int j=1;j<=i;j++){
				if(j%2!=0){

				System.out.print((char)temp+" ");
				temp++;
				temp1++;
			}else{
				System.out.print((char)temp1+" ");
				temp1++;
				temp++;
			}
			
		}

		temp1 = ch1--;
		 temp = ch--;

		System.out.println();
	}
	}
	public static void main(String[] args){
		fun(4);
	}
}

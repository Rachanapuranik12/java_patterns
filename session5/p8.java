/*        1
 *      A b
 *    1 2 3
 *  A b C d
 */


class P8{
	static void fun(int n){

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}		

			int x=1;
			char ch='A';
			char ch1='a';


			for(int j=1;j<=i;j++){
				
			if(i%2==0){
				System.out.print(ch+" ");
				ch++; ch1++;
			}else if(j%2!=0){
				System.out.print(ch1+" ");
				ch1++; ch++;
			}

			else{
				System.out.print(x+" ");
				x++;
				//ch++;
			}
			} 

			System.out.println();

	}
	
	}
	public static void main(String[] args){
		fun(4);
	}
}

/* a B c D
 *   e F g
 *     H i
 *       J
 */

class P10{
	static void fun(int n){

		char ch='a';
		char ch1='A';

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}

			for(int j=n;j>=i;j--){
				if(j%2!=0){
					System.out.print(ch1+" ");
					ch1++;
					ch++;
				}else{
					System.out.print(ch+" ");
					ch++;
					ch1++;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


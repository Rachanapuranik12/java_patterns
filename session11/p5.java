/*      A
 *    b b b
 *  C C C C C
 *d d d d d d d
 *  C C C C C
 *    b b b
 *      A
 */

class P5{
	static void fun(int n){
		int cols,space;
		char ch='A';
		char ch1='a';
		int temp=n-1;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				space=n-i;
				cols=2*i-1;

		
			}else{
				space=i-n;
				cols=temp*2-1;
				temp--;
				ch--;
				ch--;
				ch1--;
	
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=cols;j++){
		
				
				if(i%2==0){
					System.out.print(ch1+" ");
				}else{
					System.out.print(ch+" ");
				}

				
			}
			if(i<=n){
				ch++;
				ch1++;
			}else{
				ch++;
				ch1--;
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

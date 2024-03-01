/* a B c D
 *   E f G
 *     h I
 *       J
 */

class P5{
	static void fun(int n){
		char ch='a';
		char ch1='A';

		

		for(int i=0;i<n;i++){

			for(int j=0;j<i;j++){
				System.out.print("  ");
			}

			for(int k=i;k<n;k++){
				if(k==n-1){
					System.out.print(Character.toUpperCase(ch)+" ");			
					
				} else if(k%2!=0){
					System.out.print(Character.toUpperCase(ch)+" ");
				}
				
				else{
					System.out.print(ch+" ");
					
				}
				ch++;
			}
		 	
			
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

/* D
 * C D
 * B C D
 * A B C D
 * B C D
 * C D
 * D
 */

class P7{
	static void fun(int n){
		int cols;
		char ch='D';

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=i;
			}else{
				cols=2*n-i;
			}

			char temp=ch;

			for(int j=1;j<=cols;j++){
				System.out.print(temp+" ");
				temp++;
			}

			if(i<n){
				ch--;
			}else{
				ch++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


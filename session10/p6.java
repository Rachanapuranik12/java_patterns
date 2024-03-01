/*      D
 *    C D
 *  B C D
 *A B C D
 *  B C D
 *    C D
 *      D
 */

class P6{
	static void fun(int n){
		int cols,space;

		char ch='E';

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){
				cols=i;
				space=n-i;
				ch--;
			}else{
				cols=2*n-i;
				space=i-n;
				ch++;
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			char temp=ch;

			for(int j=1;j<=cols;j++){
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}



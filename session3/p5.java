/* a
 * b c
 * d e f
 * g h i j
 */


class P5{
	static void fun(int n){
		
		char ch='a';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}



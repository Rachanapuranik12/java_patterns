/* a b c d
 * a b c
 * a b
 * a
 */


class P5{
	static void fun(int n){

		for(int i=1;i<=n;i++){
			char ch='a';
			for(int j=n;j>=i;j--){
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

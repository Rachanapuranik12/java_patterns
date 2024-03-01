/* c
 * b b
 * a a a
 */


class P7{
	static void fun(int n){

		int ch=97+n-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)ch+" ");
			}
			ch--;
			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(4);
	}
}



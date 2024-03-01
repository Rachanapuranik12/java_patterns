/* 1 2 3 4
 * a b c d
 * 5 6 7 8
 * e f g h
 */


class P9{
	static void fun(int n){

		int x=1;
		char ch='a';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%2==0){

				System.out.print(ch+" ");
				ch++;
				}else{
					System.out.print(x+" ");
					x++;
				}
			}
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(4);
}
}

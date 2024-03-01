/* A A A
 * B B B
 * C C C
 */


class P7{
	static void fun(int n){

	char ch ='A';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

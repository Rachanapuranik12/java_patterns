/* 	A
 *    A B A
 *  A B C B A
 *A B C D C B A
 */

class P8{
	static void fun(int n){

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}

			char ch='A';

			for(int j=1;j<=2*i-1;j++){
				if(j<i){
				System.out.print(ch+" ");
				ch++;
				}else{
					System.out.print(ch+" ");
					ch--;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


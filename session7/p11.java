/*  		1
 *           A  b  A
 *        1  2  3  2  1
 *    A   b  C  d  C  b  A
 */

class P11{
	static void fun(int n){

		for(int i=1;i<=n;i++){

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}

			int x=1;
			char ch='A';
			char ch1='a';

			for(int j=1;j<=2*i-1;j++){
				if(i%2!=0){
					if(j<i){
						System.out.print(x+" ");
						x++;
					}else{
						System.out.print(x+" ");
						x--;
					}
				}else{
					if(j%2==0){
						System.out.print(ch1+" ");
						
					}else{
						System.out.print(ch+" ");
						
					}
				}
				if(j<i){
					ch++;
					ch1++;
				}else{
					ch1--;
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

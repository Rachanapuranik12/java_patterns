/*    		A
 *           b  a  b
 *        C  E  G  E  C
 *     d  c  b  a  b  c  d
 *  E  G  I  K  M  K  I  G  E
 */

class P10{
	static void fun(int n){
		for(int i=1;i<=n;i++){

			int ch=97+i-1;
			int ch1=65+i-1;

			for(int j=n;j>i;j--){
				System.out.print("  ");
			}

			for(int j=1;j<=2*i-1;j++){
				if(i%2==0){
					if(j<i){
						System.out.print((char)ch+" ");
						ch--;
					}else{
						System.out.print((char)ch+" ");
						ch++;
					}
				}else{
					if(j<i){
						System.out.print((char)ch1+" ");
						ch1++;
						ch1++;
					}else{
						System.out.print((char)ch1+" ");
						ch1--;
						ch1--;
					}
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(5);
	}
}


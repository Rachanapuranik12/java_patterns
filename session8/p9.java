/* A0  B1  C2  D3  E4  F5  G6
 *     H2  I3  J4  K5  L6
 *         M3  N4  O5
 *             P4
 */

class P9{
	static void fun(int n){
		int  temp=n;

		char ch='A';
		int x=0;

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("\t");
			}

			for(int j=1;j<=temp*2-1;j++){
				System.out.print(ch+""+x+"\t");
				ch++;
				x++;
			}
			x=i+1;
			temp--;
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}


/* a B c
 * d E f
 * g H i
 */


class P3{
	static void fun(int n){
		
		char ch='a';
		char ch1 = 'A';

		for(int i=1;i<=n;i++){
			//int ch1=ch-32;
			for(int j=1;j<=n;j++){
				if(j%2==0){

				System.out.print(ch1+" ");
				ch1++;
				ch++;

				}else{
					System.out.print(ch+" ");
					ch++;
					ch1++;
				}
			}
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

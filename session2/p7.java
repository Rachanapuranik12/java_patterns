/* A b C
 * d E f
 * G h I
 */


class P7{
	static void fun(int n){

		char ch='A';
		char ch1='a';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((i+j)%2==0){

				System.out.print(ch+" ");
				ch++;
				ch1++;

				}else{
					System.out.print(ch1+" ");
					ch++;
					ch1++;
					
				}
				
			}
		//	ch=ch1;
	
			
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3);
}
}

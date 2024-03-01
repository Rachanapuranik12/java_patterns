/* 10
 * I  H
 * 7  6  5
 * D  C  B  A
 */


class P10{
	static void fun(int n){

		char ch='J'; 
		int x=n*2+2;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
				System.out.print(ch+" ");
				ch--;
				x--;
			}else{
				System.out.print(x+" ");
				x--;
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



/* 1 2 3 4 
 * 5 6 7 8
 * 9 10 11 12
 */


class P2{
	static void fun(int r,int c){

		int x=1;
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				System.out.print(x+"\t");
				x++;
			}
			System.out.println();
		}
	}

public static void main(String[] args){
	fun(3,4);
}
}

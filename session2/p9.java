/* 1 2 3 4
 * a b c d
 * # # # #
 * 5 6 7 8
 * e f g h
 * # # # #
 */

class P9{
	static void fun(int r,int c){

		int x=1;
		char ch='a';

		for(int i=1;i<=r;i++){

			for(int j=1;j<=c;j++){

				if(i%4==1 || i==4){
					System.out.print(x+" ");
					x++;
				}else if(i%3==0){
					System.out.print("# ");
				}else if(i==5 || i==2) { 
				System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(6,4);
	}
}





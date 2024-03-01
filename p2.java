class P2{
	static void fun(int n){

		for(int i=1;i<=n;i++){

			int x=1;

			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

class Hollowbutterfly{
	static void fun(int n){

		int cols,space;

		for(int i=1;i<=2*n-1;i++){
			if(i<=n){

				cols=i;
				space=n-i;
			}else{
				cols=2*n-i;
				space=i-n;
			}

			for(int j=1;j<=cols;j++){
				if(j==1 || j==i || i+j==8){
					System.out.print("* ");
				}
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}

			for(int j=1;j<=cols;j++){
				if(j==2*n || i+j==9){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}




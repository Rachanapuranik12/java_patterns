class butterfly{
	static void fun(int n){

		for(int i=1;i<=2*n;i++){

			int cols;

			int space=2*n-i;

			if(i<=n){
				cols=i;

			for(int j=1;j<=cols;j++){
				System.out.print("* ");
			
			}

			}else{
				cols=n;

			for(int j=cols;j>=1;j--){
				System.out.print("* ");
			}
			}

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}

			System.out.println();
		}
	}
	public static void main(String[] args){
		fun(4);
	}
}

			

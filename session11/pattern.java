class pattern{
	static void fun(int n){


		for(int i=1;i<=n;i++){

			int space=n-i;

			for(int j=1;j<=space;j++){
				System.out.print("  ");
			
			}	
			for(int k=1;k<=n;k++){

				System.out.print("* ");
				}

			System.out.println();
		}
	}

	public static void main(String[] args){
		fun(5);
	}
}



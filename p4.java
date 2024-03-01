class P4{
	static void fun(int n){

		
			for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
		}	

			
				int x=1;
				for(int j=n;j>=i;j--){
				System.out.print(x+" ");
				x++;
			}

			System.out.println();
		
			}}

	public static void main(String[] args){
		fun(4);
	}
}

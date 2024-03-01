class pattern{
	static void fun(int n){

		int cols;int space;
		int temp=n-1;
		
		int x=0;

		for(int i=1;i<2*n;i++){

			if(i<=n){
				space=n-i;
				cols=2*i-1;
				x++;
				

			}else{
				space=i-n;
				cols=temp*2-1;
				temp--;
				x--;
			}

			for(int k=1;k<=space;k++){
				System.out.print("  ");
			}


			for(int j=1;j<=cols;j++){
				System.out.print(x+" ");
			}
		
	
		System.out.println();
		}
		
	}
	public static void main(String[] args){
		fun(4);
	}
}



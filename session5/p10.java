/* 1
 * 4     9
 * 64    125  216
 * 2401  4096 6561  10000
 */

class P10{
	static void fun(int n){

		

		int x=1;
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=i;j++){
				 if(i==2){
					 System.out.print(x*x+"\t");
					 x++;
				 }else if(i==3){
					 System.out.print(x*x*x+"\t");
					 x++;
				 }else if(i==4){
					 System.out.print(x*x*x*x+"\t");
					 x++;
				 }else{
					 System.out.print(x);
					 x++;
					
			}
			}
			
			System.out.println();
		
	
	}
	}

 public static void main(String[] args){
	 fun(4);
 }
}

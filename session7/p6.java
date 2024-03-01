/*  		d
 *           C  C  C
 *        b  b  b  b  b
 *     A  A  A  A  A  A  A
 */

class P6{
	static void fun(int n){

	char ch='d';
	char ch1='D';
	
	for(int i=1;i<=n;i++){
	    
	   for(int j=n;j>i;j--){
	       System.out.print("  ");
	   }

	  for(int j=1;j<=2*i-1;j++){
       		if(i%2==0){
      			System.out.print(ch1+" ");
			}else{
			System.out.print(ch+" ");
			}
	  }
	ch1--;
	ch--;
	System.out.println();
	}
	}
public static void main(String[] args){
	fun(4);
}
}

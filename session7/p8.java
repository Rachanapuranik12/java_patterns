/*     	 	D
 *           c  D  c
 *        B  c  D  c  B
 *    a   B  c  D  c  B  a  
 */

class P8{
       static void fun(int n){

	 char ch='D';
	 

	for(int i=1;i<=n;i++){
 	
	for(int j=n;j>i;j--){
		System.out.print("  ");
	}

	int ch1=97+i;
	int t1=ch1;
	char t2=ch;

for(int j=1;j<=2*i-1;j++){
	if(j==n){
		System.out.print("D ");
	}else if(j==n-1 || j==n+1){
		System.out.print("c ");
	}else if(j==n-2 || j==n+2){
		System.out.print("B ");
	}else{
		System.out.print("a ");
	}
}
	
	System.out.println();
	
       
       
	}
       }
public static void main(String[] args){
 	fun(4);
}
}

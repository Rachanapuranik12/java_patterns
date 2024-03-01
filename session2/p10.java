class Pattern {
    public static void main(String[] args) {
        printPattern(6,4);
    }

    static void printPattern(int r,int c) {
        
	    int x = 1;
        char ch = 'a';

        for(int i=1;i<=3;i++){
		for(int j=1;j<=4;j++){
			if(i%2==0){
				System.out.print(ch+" ");
				ch++;
			}
			else if(i%3==0){
				System.out.print("# ");
		}else{
			System.out.print(x+" ");
			x++;
		}
    }
    System.out.println();
	}

	for(int i=4;i<=6;i++){
		for(int j=1;j<=4;j++){
			if(i%4==0){
				System.out.print(x+" ");
				x++;
			}else if(i%3==0){
				System.out.print("# ");
			}else{
				System.out.print(ch+" ");
				ch++;
			}
		}
		System.out.println();


}
}
}



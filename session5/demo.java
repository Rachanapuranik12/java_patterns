 class PatternPrint {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Print numbers or letters
            char ch = 'A';
	    char ch1='a';
            for (int j = 0; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) (ch + j) + " ");
		    ch++;
		    ch1++;
                } else {
                    System.out.print(j + 1 + " ");
                
		
		}
		if(j%2==0){
			System.out.print(ch1+" ");
			ch1++;
		}else{
			System.out.print(j+1+" ");
		} 

            }

            // Move to the next line
            System.out.println();
        }
    }
}



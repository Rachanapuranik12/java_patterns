class CharacterPattern {
    public static void main(String[] args) {
        char currentChar = 'a';
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }

            // Print characters (lowercase)
            for (int k = 0; k <= i; k++) {
                System.out.print(currentChar + "  ");
                currentChar++;
            }

            // Reset currentChar to 'A' for uppercase letters
            currentChar = 'A';

            // Print characters (uppercase)
            for (int k = 0; k < i; k++) {
                System.out.print(currentChar + "  ");
                currentChar++;
            }

            // Move to the next line
            System.out.println();
        }
    }
}

	

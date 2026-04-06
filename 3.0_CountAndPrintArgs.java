public class CountAndPrintArgs {
    // The 'args' array contains all the command-line arguments passed to the program
    public static void main(String[] args) {
        
        // args.length gives us the total number of arguments
        System.out.println("No. of arguments - " + args.length);

        // Instead of StringBuilder, we start with an empty regular String
        String firstLetters = "";

        // A traditional 'for' loop using an index 'i'
        // It starts at 0 and runs as long as 'i' is less than the length of the array
        for (int i = 0; i < args.length; i++) {
            
            // We get the current word by accessing the array at index 'i'
            String arg = args[i];
            
            // We check if the argument is not empty to avoid errors
            if (arg.length() > 0) {
                // charAt(0) grabs the very first letter of the word
                // The += operator attaches the new letter to the end of our existing string
                firstLetters += arg.charAt(0); 
            }
        }

        // Print the combined first letters
        System.out.println(firstLetters);
    }
}
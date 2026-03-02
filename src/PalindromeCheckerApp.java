public class PalindromeCheckerApp {


    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";


    public static void main(String[] args) {


        System.out.println("======================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" " + VERSION);
        System.out.println("======================================");


        System.out.println("Application started successfully.");
        System.out.println("Ready to proceed to palindrome validation...");
    }
}
public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String word = "madam";


        String reversed = "";


        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }


        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
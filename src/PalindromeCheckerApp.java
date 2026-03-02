public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker";
    private static final String APP_VERSION = "1.0.0";

    public static void main(String[] args) {
        displayWelcomeMessage();
        System.out.println("Application is ready to process palindromes...");
    }

    private static void displayWelcomeMessage() {
        System.out.println("==================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println("Version: " + APP_VERSION);
        System.out.println("==================================");
    }
}
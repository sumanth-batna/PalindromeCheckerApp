public class PalindromeCheckerApp {

    // Service class (OOP logic)
    static class PalindromeService {

        public boolean isPalindrome(String str) {
            // Normalize input (ignore case & special characters)
            str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

            int start = 0;
            int end = str.length() - 1;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

    // Main method
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String str = "A man a plan a canal Panama";

        if (service.isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
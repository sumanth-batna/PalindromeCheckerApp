public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        // Convert to lowercase & remove spaces
        str = str.toLowerCase().replaceAll("\\s+", "");

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

    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
        // UC4: Character Array Based Palindrome Check
        char[] arr = str.toCharArray();
        boolean isPalindrome = true;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
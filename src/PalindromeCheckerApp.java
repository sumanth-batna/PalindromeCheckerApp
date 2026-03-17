public class PalindromeCheckerApp {

    // 1️⃣ Strategy Interface
    interface PalindromeStrategy {
        boolean isPalindrome(String str);
    }

    // 2️⃣ Strategy 1: Two-pointer method
    static class TwoPointerStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String str) {
            str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

            int start = 0, end = str.length() - 1;

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

    // 3️⃣ Strategy 2: Stack method
    static class StackStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String str) {
            java.util.Stack<Character> stack = new java.util.Stack<>();

            for (char c : str.toCharArray()) {
                stack.push(c);
            }

            for (char c : str.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }

    // 4️⃣ Context class
    static class PalindromeContext {
        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String str) {
            return strategy.isPalindrome(str);
        }
    }

    // 5️⃣ Main method
    public static void main(String[] args) {

        String input = "madam";

        // Use Two-pointer strategy
        PalindromeContext context = new PalindromeContext(new TwoPointerStrategy());
        System.out.println("TwoPointer: " + context.check(input));

        // Switch to Stack strategy
        context.setStrategy(new StackStrategy());
        System.out.println("Stack: " + context.check(input));
    }
}
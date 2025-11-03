package Recursion;

class PalindromeChecker {

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("racecar: " + checker.isPalindrome("racecar"));
        System.out.println("level: " + checker.isPalindrome("level"));
        System.out.println("hello: " + checker.isPalindrome("hello"));
        System.out.println("a: " + checker.isPalindrome("a"));
    }
}
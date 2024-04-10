public class Palindrome {
    static void checkPalindrome(int num, int reverse, int copy) {
        if (num == 0) {
            if (reverse == copy) {
                System.out.println("The number is palindrome");
            } else {
                System.out.println("The number is not Palindrome");
            }
            return;
        }
        reverse = reverse * 10 + num % 10;
        checkPalindrome(num / 10, reverse, copy);
    }

    public static void main(String[] args) {
        int number = 1234;
        checkPalindrome(number, 0, number);

    }

}

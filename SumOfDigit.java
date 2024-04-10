public class SumOfDigit {
    static void sumOfDigit(int num, int sum) {
        if (num == 0) {
            System.out.println("The sum is " + sum);
            return;
        }
        sum += num % 10;
        sumOfDigit(num / 10, sum);
    }

    static int sumOfDigit(int num) {
        
    }

    public static void main(String[] args) {
        // sumOfDigit(12345, 0);
        System.out.println(sumOfDigit(12345));
    }

}

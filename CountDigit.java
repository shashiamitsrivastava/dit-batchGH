public class CountDigit {
    static int countDigit(int num) {
        if (num == 0) {
            return 0;
        }
        int count = countDigit(num / 10);
        count++;
        return count;
    }

    static void countDigit(int num, int count) {
        if (num == 0) {
            System.out.println("The value of COunt is " + count);
            return;
        }
        count++;
        countDigit(num / 10, count);

    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println(countDigit(number));
    }

}

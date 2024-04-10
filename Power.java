public class Power {
    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        int ans = power(num, pow - 1);
        ans *= num;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

}

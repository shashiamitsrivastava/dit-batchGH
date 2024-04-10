public class PrintTable {
    static void printTable(int num, int mul) {
        if (mul < 1) {
            return;
        }
        printTable(num, mul - 1);
        System.out.println(num + "x" + mul + "=" + num * mul);
    }

    static String table(int num, int mul) {
        if (mul < 1) {
            return "";
        }
        String ans = table(num, mul - 1);
        ans += num + "x" + mul + "=" + num * mul + "\n";
        return ans;
    }

    public static void main(String[] args) {
        int num = 5;
        // printTable(num, 10);
        String ans = table(num, 10);
        System.out.println(ans);

    }

}

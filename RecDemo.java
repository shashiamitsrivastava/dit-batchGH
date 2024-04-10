public class RecDemo {
    static void printName(int val) {
        if (val == 0) {
            return;
        }
        System.out.println("FN " + val);
        printName(val - 1);
        System.out.println("LN " + val);
    }

    public static void main(String[] args) {
        printName(5);
    }
}
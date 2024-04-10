public class RopCut {
    static int maxCut(int len, int a, int b, int c) {
        if (len == 0) {
            return 0;
        }
        if (len < 0) {
            return -1;
        }
        int option1 = maxCut(len - a, a, b, c);
        int option2 = maxCut(len - b, a, b, c);
        int option3 = maxCut(len - c, a, b, c);
        int result = Math.max(Math.max(option1, option2), option3);
        if (result == -1) {
            return -1;
        }
        return result + 1;
    }

    public static void main(String[] args) {
        int len = 5;
        int a = 2;
        int b = 5;
        int c = 1;
        System.out.println(maxCut(len, a, b, c));
    }

}

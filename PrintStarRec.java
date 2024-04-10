public class PrintStarRec {

    static void printStar(int numberOfStars) {
        if (numberOfStars == 0) {
            return;
        }
        System.out.print("*");
        printStar(numberOfStars - 1);
    }

    static void printLine(int numberOfLines) {
        if (numberOfLines == 0) {
            return;
        }
        printStar(numberOfLines);
        System.out.println();
        printLine(numberOfLines - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printLine(n);

    }
}
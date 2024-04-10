public class DiceBoard {
    static void diceBoard(int currentValue, int endValue, String result) {
        if (currentValue == endValue) {
            System.out.print(result + " , ");
            return;
        }
        if (currentValue > endValue)
            return;
        for (int dice = 1; dice <= 6; dice++) {
            diceBoard(currentValue + dice, endValue, result + dice);
        }
    }

    public static void main(String[] args) {
        diceBoard(0,10,"");
    }

}

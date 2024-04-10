public class MazePath {
    static void mazePath(int row, int col, int endRow, int endCol, String result) {
        if (col == endCol && row == endRow) {
            System.out.println(result);
            return;
        }
        if (col > endCol || row > endRow) {
            return;
        }
        mazePath(row, col + 1, endRow, endCol, result + "H");
        mazePath(row + 1, col, endRow, endCol, result + "V");
    }

    public static void main(String[] args) {
        mazePath(0, 0, 2, 2, "");
    }

}

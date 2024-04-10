public class Subsequence {
    public static void genSubsequence(String str, String result) {
        if (str == "") {
            System.out.print(result + " , ");
            return;
        }
        genSubsequence(str.substring(1), result);
        genSubsequence(str.substring(1), result + str.charAt(0));
    }

    public static void main(String[] args) {
        genSubsequence("abc", "");
    }
}
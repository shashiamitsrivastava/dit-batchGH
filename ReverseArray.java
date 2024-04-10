public class ReverseArray {
    static void reverseArray(int[] arr, int first, int last) {
        if (first >= last) {
            return;
        }
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
        reverseArray(arr, first + 1, last - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        reverseArray(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

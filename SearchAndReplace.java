public class SearchAndReplace {
    static void searchAndReplace(int[] arr, int index, int ele, int replace) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == ele) {
            arr[index] = replace;
        }
        searchAndReplace(arr, index + 1, ele, replace);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 39, 10, 10, 10, 50, 50, 50 };
        int ele = 10;
        int replace = 100;
        searchAndReplace(arr, 0, ele, replace);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
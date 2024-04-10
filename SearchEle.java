public class SearchEle {
    static boolean search(int[] arr, int ele, int index) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == ele) {
            return true;
        }

        return search(arr, ele, index + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int ele = 30;
        System.out.println(search(arr, ele, 0) ? "Found" : "Not Found");
    }

}

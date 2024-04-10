public class CountFrequency {
    static void countFrequency(int[] arr, int index, int count, int ele) {
        if (index == arr.length) {
            System.out.println("The count is " + count);
            return;
        }
        if (arr[index] == ele) {
            count++;
        }
        countFrequency(arr, index + 1, count, ele);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 50, 50, 50 };
        countFrequency(arr, 0, 0, 50);
    }

}

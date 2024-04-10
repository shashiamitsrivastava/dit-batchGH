public class CountEvenOdd {
    static void countEvenOdd(int num, int even, int odd) {
        if (num == 0) {
            System.out.println("Even Count " + even + "Odd Count " + odd);
            return;
        }
        if (num % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        countEvenOdd(num - 1, even, odd);
    }

    static int[] countEvenOdd(int num) {
        if (num == 0) {
            int arr[] = new int[2];
            return arr;
        }
        int[] arr = countEvenOdd(num - 1);
        if (num % 2 == 0) {
            arr[0]++;
        } else {
            arr[1]++;
        }
        return arr;

    }

    public static void main(String[] args) {
        // countEvenOdd(10, 0, 0);
        int arr[] = countEvenOdd(10);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}

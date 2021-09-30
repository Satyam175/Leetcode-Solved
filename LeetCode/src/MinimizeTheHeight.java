import java.util.Arrays;
public class MinimizeTheHeight {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 10};
        minimizeHeight(array, 4, 2);
    }
    static void minimizeHeight(int[] arr, int n, int k) {
        int sum = 0;
        for (int i : arr) {
            sum = i + sum;
        }
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int min = 0;
            for (int j : arr) {
                min = Integer.min(i, min);
            }
            for (int j : arr) {
                max = Integer.max(i, max);
            }
            if (k - arr[i] < min && k - arr[i] >= 0) {
                arr[i] = k - arr[i];
            } else {
                System.out.println("returned");
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

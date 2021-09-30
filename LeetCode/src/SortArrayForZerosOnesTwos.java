import java.util.Arrays;

public class SortArrayForZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0, 2};
        int zeors = count(0, arr);
        int one = count(1, arr);
        int two = count(2, arr);
        for (int i = 0; i < zeors; i++) {
            arr[i] = 0;
        }
        for (int i = zeors; i < one + two; i++) {
            arr[i] = 1;
        }
        for (int i = zeors + one; i < two + one + zeors; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));

    }

    static int count(int n, int[] array) {
        int temp = 0;
        for (int i : array) {
            if (i == n) {
                temp++;
            }
        }
        return temp;
    }
}

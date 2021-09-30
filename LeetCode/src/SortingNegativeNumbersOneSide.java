import java.util.Arrays;

public class SortingNegativeNumbersOneSide {
    public static void main(String[] args) {
        int[] array = {1, -1, -3, -2, 4, 3, 2,-5};
        sort(array);
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != counter) {
                    int temp = arr[i];
                    arr[i] = arr[counter];
                    arr[counter] = temp;
                }
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

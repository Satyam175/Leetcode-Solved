import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 23, 4, -1, -3};
        arraySort(array);
    }
    static void arraySort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

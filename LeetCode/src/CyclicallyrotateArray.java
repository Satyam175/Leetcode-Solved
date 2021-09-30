import java.util.Arrays;

public class CyclicallyrotateArray {
    public static void main(String[] args) {
        CyclicallyrotateArray c = new CyclicallyrotateArray();
        int[] array = {1, 2, 3, 4, 5};
        c.rotate(array, 1);
    }

    public void rotate(int[] arr, int n) {
        int[] arrRot = new int[arr.length];
        for (int i = 0; i < n; i++) {
            arrRot[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < arr.length - n; i++) {
            arrRot[n + i] = arr[i];
        }
        System.out.println(Arrays.toString(arrRot));

    }
}

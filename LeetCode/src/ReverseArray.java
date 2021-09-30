import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reverseArr(array);
    }
    static void reverseArr(int[] arr) {

        int temp;
        int start =0;
        int end =arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
        System.out.println(Arrays.toString(arr));

    }

}

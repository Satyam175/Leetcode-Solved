//Kadane's Algorithm
public class MaxContiSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-1,2};
        SubArray(arr);
    }
    static void SubArray(int[] arr) {
        int max_so_far = 0; // maxvalue returned
        int max_ending_here = 0;

        for (int j : arr) {
            max_ending_here = max_ending_here + j;

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        System.out.println("Maximum sum is " + max_so_far);
    }
}

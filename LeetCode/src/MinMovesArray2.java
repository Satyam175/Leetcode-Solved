import java.util.Arrays;

public class MinMovesArray2 {
    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{9,1,10,2,5,7}));
    }
    public static int minMoves(int[] nums){
        Arrays.sort(nums);
        int moves = 0 ;
        int median = nums[nums.length / 2];
        System.out.println(nums.length/2);
        for (int num : nums){
            moves += Math.abs(median - num);
        }
        return moves;
    }
}

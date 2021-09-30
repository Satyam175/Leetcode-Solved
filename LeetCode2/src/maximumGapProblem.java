import java.util.Arrays;

public class maximumGapProblem {
    public static void main(String[] args) {
        int[] arr = {3};
        System.out.println(maximumGap(arr));
    }
    public static int maximumGap(int[] nums){
        if (nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxGap = Integer.MIN_VALUE;
        for (int i=0;i< nums.length-1;i++){
            if (nums[i+1]-nums[i]>maxGap){
                maxGap=nums[i+1]-nums[i];
            }
        }
        return maxGap;
    }


}

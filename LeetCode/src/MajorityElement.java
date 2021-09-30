import java.util.HashSet;
import java.util.Set;

public class MajorityElement{
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,1,1,1,2,2,2,2};
        int va = majorityElement(arr);
        System.out.println(va);
    }
    // static int majorityElement(int[] nums){
    //     int val=0;
    //     for (int i=0;i< nums.length;i++){
    //         int count= 0;
    //         for (int j=0;j<nums.length;j++){
    //             if (nums[i]==nums[j]){
    //                 count++;
    //             }
    //         }
    //         if (count> nums.length/2){
    //             val = nums[i];
    //         }
    //     }
    //     return val;
    // }

    public static int majorityElement(int[] nums) {
        Set<Integer> num_list = new HashSet<>();
        for (int j : nums){
            num_list.add(j);
        }
        for(int n:num_list){
            if(num_count(n,nums)>nums.length/2){
                return n;
            }
        }
        return 0;
    }
    public static int num_count(int n,int[] nums){
        int count = 0;
        for (int num : nums) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }

}

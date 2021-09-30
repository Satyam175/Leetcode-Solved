import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    private static HashSet<Object> seen;
    private static HashMap<Integer, Integer> memo;
    public static void main(String[] args) {
        int[] arr = {12,34,654,1,2,3,9,4,5,6,0,-2,-1};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        seen = new HashSet<>();
        for (int x : nums) seen.add(x);

        memo = new HashMap<>();
        int ans = 0;
        for (int x : nums)
            ans = Math.max(ans, dp(x));
        return ans;
    }
    public static int dp(int x) {
        if (memo.containsKey(x)) return memo.get(x);
        int ans = 1;
        if (seen.contains(x-1))
            ans += dp(x-1);
        memo.put(x, ans);
        return ans;
    }
//    public static int longestConsecutive(int[] nums){
//        Map<Integer,Integer> nmaps = new HashMap<>();
//        int ans = 0;
//        int[] seen = new int[nums.length];
//        for (int i=0;i< nums.length;i++){
//            if (!nmaps.containsKey(nums[i])){
//                nmaps.put(nums[i],i);
//            }
//        }
//        for (int n:nums){
//            int curr = n,count = 1;
//            if (seen[nmaps.get(curr)]>0){
//                continue;
//            }
//            while (nmaps.containsKey(curr+1)){
//                int ix = nmaps.get(++curr);
//                if (seen[ix]>0){
//                    count+=seen[ix];
//                    break;
//                } else {
//                    seen[ix] = 1;
//                    count++;
//                }
//            }
//            seen[nmaps.get(n)]=count;
//            ans = Math.max(ans,count);
//        }
//        return ans;
//    }
}

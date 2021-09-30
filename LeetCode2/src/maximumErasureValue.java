import java.util.HashMap;
import java.util.Map;

public class maximumErasureValue {
    public static void main(String[] args) {
        int[] arr = {4,2,4,5,6};
        System.out.println(maxUniqueSubArray(arr));
    }
    public static int maxUniqueSubArray(int[] nums){
        Map<Integer, Integer> seen = new HashMap<>();
        int l = 0, sum = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (seen.containsKey(x)) {
                int index = seen.get(x);
                while (l <= index) {  // Move the left side until index + 1
                    seen.remove(nums[l]);
                    sum -= nums[l];
                    l += 1;
                }
            }
            seen.put(x, i);
            sum += x;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}

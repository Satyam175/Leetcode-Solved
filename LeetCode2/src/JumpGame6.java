import java.util.Deque;
import java.util.LinkedList;
public class JumpGame6 {
    public static void main(String[] args) {
        int[] arr = {1,-1,-2,4,-7,3};
        System.out.println(maxResult(arr,2));
    }
    public static int maxResult(int[] nums , int k){
        int n = nums.length;
        int[] dp = new int[n];
        Deque<Integer> q = new LinkedList<>();
        dp[n - 1] = nums[n - 1];
        q.addLast(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            if (q.peekFirst() - i > k) {
                q.removeFirst();
            }
            dp[i] = nums[i] + dp[q.peekFirst()];
            while (!q.isEmpty() && dp[q.peekLast()] < dp[i]) {
                q.removeLast();
            }
            q.addLast(i);
        }
        return dp[0];
    }
}

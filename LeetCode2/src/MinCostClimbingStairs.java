public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {20,15,5,8};
        System.out.println(minCost(arr));
    }
    public static int minCost(int[] cost){
        for (int i = cost.length - 3; i >= 0; i--)
            cost[i] += Math.min(cost[i+1], cost[i+2]);
        return Math.min(cost[0], cost[1]);

    }
}
//This is an introduction to a top-down dynamic programming (DP) approach solution.
//We can think of this as the build-up of a number of smaller subproblems, starting at the end.
//
//At each step, we can consider the answer to be the combined cost of the current step,
// plus the lesser result of the total cost of each of the solutions starting at the next two steps.
// This means that, thinking backwards, we can solve for the smallest problem first, and then build down from there.
//
//For the last two steps, the answer is clearly their individual cost. For the third to last step, it's that step's cost, plus the lower of the last two steps.
// Now that we know that, we can store that data for later use at lower steps. Normally, this would call for a DP array, but in this case, we could simply store the values in-place.
//
//(Note: If we choose to not modify the input, we could create a DP array to store this information at the expense of O(N) extra space.)
//
//So we should iterate downward from the end, starting at the third step from the end, and update the values in cost[i]
// with the best total cost from cost[i] to the end. Then, once we reach the bottom of the steps, we can choose the best result of cost[0] and cost[1] and return our answer.
//
//Time Complexity: O(N) where N is the length of cost
//Space Complexity: O(1)
//or O(N) if we use a separate DP array
public class MinMovesArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(minMoves2(arr));
    }
    public static int minMoves2(int[] nums){
        int moves = 0;
        int min = nums[0];
        for (int num : nums){
            min = Math.min(num,min);
        }
        for (int num : nums){
            moves += num-min;
        }
        return moves;
    }
}
//    To make elements equal, it means we need to make the difference between min element and max element in array equal to 0.
//        In each move, we can increase all n-1 elements by one. We should never choose to increase our max element
//        ,so we choose to increase other elements except our current max element. Instead of that, we can choose to decrease max element by one,
//        so the difference between elements still the same.
//        So in each move, we need to decrease the current element by one to until every element become min element.
//        The problem becomes: count difference between other elements with our min element in the array.
//        Complexity
//
//        Time: O(N)
//        Space: O(1)
public class MaxCardPints {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,5,1};
        int score = maxScore(arr, 3);
        System.out.println(score);
    }
    public static int maxScore(int[] cardPoints, int k) {
        if (k == 1) return Math.max(cardPoints[0], cardPoints[cardPoints.length-1]);

        int length = cardPoints.length;
        int cur = 0;
        for (int i = 0; i < k; ++i) cur += cardPoints[i];
        int max = cur;
        int endIndex = k - 1;
        for (int i = length - 1; i > length - 1 - k; --i) {
            cur -= cardPoints[endIndex--];
            cur += cardPoints[i];
            max = Math.max(max, cur);
        }
        return max;

//        int ans;
//        int sum = 0;
//        for (int i = 0; i < k; i++) {
//            sum += cardPoints[i];
//        }
//        if (k == cardPoints.length) {
//            return sum;
//        }
//        ans = sum;
//        int endIndex = k-1;
//        for (int i = cardPoints.length-1; i > cardPoints.length-1+k; --i) {
//            sum += cardPoints[i];
//            sum -= cardPoints[endIndex--];
//            ans = Math.max(ans, sum);
//        }
//        return ans;
    }
}
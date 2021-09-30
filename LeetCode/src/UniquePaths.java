public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
//    The formula used: n!/k!(n-k)!
    public static long helper (long min, long max, long total) {
        int j = 1;
        long res = 1;
        for (long i = max + 1; i <= total; i++, j++) {
            res *= i;
            res /= j;
        }
        return res;
    }
    public static int uniquePaths (int m, int n) { //Combinatorics, Math
        if (m == 1 || n == 1) return 1;
        long totalSteps = (m-1) + (n-1);
        long rightSteps = n-1;
        long downSteps = m-1;

        long max = Long.max(rightSteps, downSteps);
        long min = Long.min(rightSteps, downSteps);

        return (int) helper(min, max, totalSteps);
    }
//    static int uniquePaths(int m, int n){
//        if (m==1 && n==1) return 1;
//        if (m==0 && n==0) return 0;
//
//        return uniquePaths(m,n-1)+uniquePaths(m-1,n);
//    }
}

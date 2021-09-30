public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n){

        if (n==1 || n==2){ return n;}
        int first = 1,second = 2;

        for (int i=3;i<=n;i++){
            int total = first+second;
            first=second;
            second=total;
        }
        return second;
    }
}

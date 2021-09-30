public class SuperPalindrome {
    public static void main(String[] args) {
//        int i = checkSuperPalindromes("4","1000");
        System.out.println(9/10);

    }
    static int checkSuperPalindromes(String left, String right){
        long Left = Long.parseLong(left);
        long Right = Long.parseLong(right);

        int count = 0;
        for (long i =Left ; i<=Right ; i++){
            if (checkPalindrome(i)){
                double sqr = Math.sqrt(i);
                if (sqr%1==0){
                    if (checkPalindrome((long)sqr)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    static boolean checkPalindrome(long A) {
        long r=2, sum = 0;
        long temp = A;
        while (A > 0) {
            r = A % 10;
            sum = (sum * 10) + r;
            A /= 10;
        }
        return temp == sum;
    }
}

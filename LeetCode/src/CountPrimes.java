import java.util.ArrayList;
public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes c= new CountPrimes();
        System.out.println(c.countPrimes(49971));
    }
    public int countPrimes(int n){
        boolean[] primes = new boolean[n];
        for(int i=0; i <= n; i++){
            if(!primes[i]) {
                for(int j=i;j<n;j++){
                    primes[i*j] = true;
                }
            }
        }
        int count = 0;
        for(int i=2;i<primes.length;i++) {
            if(!primes[i]) {
                count = count+1;
            }
        }
        return count;
    }
//    public static int countPrimes(int n){
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i=1;i<n;i++){
//            if (isPrime(i)){
//                arr.add(i);
//            }
//        }
//        return arr.size();
//    }
//    public static boolean isPrime(int idx){
//        if (idx<=1){
//            return false;
//        }
//        for (int j=2;j<idx;j++ ){
//            if (idx%j == 0){
//                return false;
//            }
//        }
//        return true;
//    }
}

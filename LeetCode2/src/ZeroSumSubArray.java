import java.util.* ;
public class ZeroSumSubArray {
    public static int MyClass(int l,int[] arr){
        Set<Integer> hs = new HashSet<>();
        int sum = 0;
        for (int i=0;i<l;i++){
            sum+=arr[i];
            if (sum ==0 || arr[i]==0 || hs.contains(sum)) return 1;
            hs.add(sum);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {6,-3,2,1};
        System.out.println(MyClass(4,arr));
    }
}

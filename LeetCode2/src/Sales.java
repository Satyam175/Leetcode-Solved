import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i=0;
        while (i<n){
            int a  = scanner.nextInt();
            arr[i]=a;
            i++;
        }
        int firstMax = maxNum(arr);
        int secMax = secNum(arr);
        System.out.println(firstMax+secMax);

    }

    private static int secNum(int[] arr) {
        int max = maxNum(arr);
        int secMax = Integer.MAX_VALUE;
        for (int a:arr){
            if (a<max){
                secMax=Integer.min(secMax,a);
            }
        }
        return secMax;
    }

    static int maxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int a : arr){
            max = Math.max(max,a);
        }
        return max;
    }
}

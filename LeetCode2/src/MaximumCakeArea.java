import java.util.Arrays;

public class MaximumCakeArea {
    public static void main(String[] args) {
        int[] hor = {37,40,41,30,27,10,31};
        int[] ver ={2,1,9,5,4,12,6,13,11};
        System.out.println(maxArea(50,15,hor,ver));
    }
    public static int maxArea(int h,int w,int[] horizontalCuts,int[] verticalCuts){
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxDiffHor = Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        int maxDiffVer = Math.max(verticalCuts[0],w-verticalCuts[verticalCuts.length-1]);
        for (int i=1;i<horizontalCuts.length;i++){
            maxDiffHor = Math.max(maxDiffHor,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        for (int i=1;i<verticalCuts.length;i++){
            maxDiffVer = Math.max(maxDiffVer,verticalCuts[i]-verticalCuts[i-1]);
        }

        return (int)((long)maxDiffHor * maxDiffVer % 1000000007);
    }
}

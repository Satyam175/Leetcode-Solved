import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private static List<String> ans;
    private static int m;
    private static int s=0;

    public static void main(String[] args) {
        System.out.println(generateParentheses(6));
        System.out.println(s);
    }
    public static List<String> generateParentheses(int N){
        ans = new ArrayList<>();
        m = 2 * N;
        dfs(0, 0, 0);
        return ans;
    }
    private static void dfs(int pos, int open, int seq) {
        if (pos == m) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < m; i++)
                res.append((seq & 1 << i) > 0 ? "(" : ")");
            s++;
            ans.add(res.toString());
            return;
        }
        if (open > 0) dfs(pos+1, open-1, seq);
        if (m - pos > open) dfs(pos+1, open+1, seq | 1 << pos);
    }
}

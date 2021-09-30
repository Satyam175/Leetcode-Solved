import java.util.*;
public class LongestStringChain {
    public static void main(String[] args) {
        String[] words = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        System.out.println(longestStrChain(words));
    }
    private static int longestStrChain(String[] words){
        Map<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(words));
        Arrays.sort(words,Comparator.comparingInt(String::length));
        int max = Integer.MIN_VALUE;
        for (String s : words){
            if(s.length()>1) {
                int len = util(s,map,set);
                max = Math.max(max,len);
            } else {
                map.put(s,1);
            }
        }
        return max;
    }
    private static int util(String S, Map<String, Integer> map, Set<String> set) {
        if(map.containsKey(S)) {
            return map.get(S);
        }
        int max=0;
        for(int i=0;i<S.length();i++) {
            String next = S.substring(0,i)+S.substring(i+1);
            if(set.contains(next)) {
                max = Math.max(max,util(next,map,set));
            }
        }
        map.put(S,max+1);
        return max+1;
    }
}

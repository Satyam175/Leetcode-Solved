import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        String[] words = {"acdfee","bee","cmnopp","abcdkk"} ;
        System.out.println(findAndReplacePattern(words,"abcdee"));
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern){
        List<String> ansList = new ArrayList<>();
        String p =normalize(pattern);
        for (String s : words){
            if (p.equals(normalize(s))){
                ansList.add(s);
            }
        }
        return ansList;
    }
    public static String normalize(String str){
        Map<Character,Character> seen = new HashMap<>();
        char next = 'a';
        StringBuilder sb = new StringBuilder();
        for (char c :  str.toCharArray()){
            if (!seen.containsKey(c)){
                seen.put(c,next);
                next++;
            }
            sb.append(seen.get(c));
        }
        return sb.toString();
    }
}
//Time & Space: O(N * K), where N is number of words, K is length of each word.
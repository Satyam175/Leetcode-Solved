import java.util.ArrayList;
import java.util.List;

public class PalindromePairs {
    public static void main(String[] args) {
        String[] words1 = {"abcd","dcba","lls","s","sssll"};
        String[] words2 = {"a",""};
        System.out.println(palindromePairs(words2));
    }
    public static List<List<Integer>> palindromePairs(String[] words){
        List<List<Integer>> outList = new ArrayList<>();
        for (int i=0;i<words.length;i++){
            for (int j=i+1;j< words.length;j++){
               String concat1 = words[i]+words[j];
               String concat2 = words[j]+words[i];
               if (isPalindrome(concat1)){
                   ArrayList<Integer> temp = new ArrayList<>();
                   temp.add(i);
                   temp.add(j);
                   outList.add(temp);
               }
               if (isPalindrome(concat2)){
                   ArrayList<Integer> temp = new ArrayList<>();
                   temp.add(j);
                   temp.add(i);
                   outList.add(temp);
               }
            }
        }
        return outList;
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i++)!=s.charAt(j--))
                return false;

        }
        return true;
    }
}

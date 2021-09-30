//length of common substring

public class DeleteOperation {
    public static void main(String[] args) {
        System.out.println(minDistance("sea","ate"));
    }
    public static int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        /*Approach
         * Min distance = (len1 - len of longest common subsequence) - (len2 - len of longest common subsequence)
         *              = len1 + len2 - (2 * length of common subsequence)
         */
        return n1 + n2 - (getLcs(word1, word2) * 2);
    }
    public static int getLcs(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        //Bottom Up Approach
        int[] dp = new int[n2 + 1];
        int prev = 0;
        for(int i = 1; i <= n1; i++){
            prev = 0;

            for(int j = 1; j <= n2; j++){
                //Current characters are equal in both string.
                int lcs = 0;
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    //Append 1 to previous max LCS till length l1 - 1, l2 - 1 of given strings respectively.
                    lcs = 1 + prev;

                }else {
                    //Case 1 : Substring of length l1 - 1, and l2 of respective strings (str1 and str2)
                    //Case 2 : Substring of length l1, and l2 - 1 of respective strings
                    lcs = Math.max(dp[j], dp[j - 1]);
                }
                prev = dp[j];
                dp[j] = lcs;
            }
        }
        return dp[n2];
    }
//    public static int minDistance(String word1,String word2){
//        Map<Character,Integer> wordOne = makeMap(word1);
//        Map<Character,Integer> wordTwo = makeMap(word2);
//        ArrayList<Character> list = new ArrayList<>();
//        int steps = 0;
//        for (Map.Entry chars : wordOne.entrySet()){
//            char a = (char) chars.getKey();
//            int value = (int) chars.getValue();
//            if (wordTwo.containsKey(a)){
//                int val2 = wordTwo.get(a);
//                if (value>val2){
//                    steps+=value-val2;
//                } else if (val2>value){
//                    steps+=val2-value;
//                }
//                list.add(a);
//            } else {
//                steps+=value;
//                list.add(a);
//            }
//        }
//        for (Map.Entry chars2 : wordTwo.entrySet()){
//            char a2 = (char) chars2.getKey();
//            int val = (int) chars2.getValue();
//            if (!list.contains(a2)){
//                steps+=val;
//            }
//        }
//        return steps;
//    }
//    public static HashMap<Character, Integer> makeMap(String a) {
//        char[] arrA = a.toLowerCase().toCharArray();
//        HashMap<Character, Integer> mapA = new HashMap();
//
//        for (char i : arrA) {
//            if (mapA.containsKey(i)) {
//                int p = mapA.get(i);
//                p += 1;
//                mapA.remove(i);
//                mapA.put(i, p);
//            } else {
//                mapA.put(i, 1);
//            }
//        }
//        return mapA;
//    }
}
//Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.
//
//In one step, you can delete exactly one character in either string.


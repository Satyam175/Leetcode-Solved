public class MaaxProductsOfWordsLenghts {
    public static void main(String[] args) {
        String[] words = {"a","ab","abc","d","cd","bcd","abcd"};
        System.out.println(maxProducts(words));
    }
    public static int maxProducts(String[] words){
        int max = 0;
        int[] mask = new int[words.length];

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                mask[i] = (mask[i] | (1 << (words[i].charAt(j) - 'a')));
            }
        }
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if((mask[i] & mask[j]) == 0)max = Math.max(max, words[i].length() * words[j].length());
            }
        }
        return max;
    }
}

public class SmallerStrings {

    static String newString(String s, int k) {
        // new string
        String X = "";

        // Remove characters until
        // the string  is empty
        while (s.length() > 0) {

            char temp = s.charAt(0);

            // Traverse to find the smallest character in the
            // first k characters
            for (int i = 1; i < k && i < s.length(); i++) {
                if (s.charAt(i) < temp) {
                    temp = s.charAt(i);
                }
            }

            // append the smallest character
            X = X + temp;

            // removing the lexicographically smallest
            // character from the string
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == temp) {

                    s = s.substring(0, i) + s.substring(i + 1);
                    //s.erase(s.begin() + i);
                    break;
                }
            }
        }
        return X;
    }
    public static void main(String[] args) {
        String s = "gaurang";
        int k = 3;

        System.out.println(newString(s, k));

    }
}
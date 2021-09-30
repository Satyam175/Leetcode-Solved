public class AddString {
    public static void main(String[] args) {
        System.out.println(addStrings("168","1"));
    }
    public static String addStrings(String num1 , String num2) {
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder result = new StringBuilder();

        while (i >=0 || j >=0) {
            int a = i >= 0 ? Character.getNumericValue(num1.charAt(i)) : 0;
            int b = j >= 0 ? Character.getNumericValue(num2.charAt(j)) : 0;

            int sum = carry + a + b;

            i--;
            j--;
            carry = sum / 10;
            sum = sum%10 ;

            result.append(sum);
        }
        if (carry>0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}

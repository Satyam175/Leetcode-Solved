public class ToLowerCase {
    public static void main(String[] args){
        String p = "HelloP";
        System.out.println(toLowercase(p));
    }
    public static String toLowercase(String s){
        StringBuilder str = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>=65 && s.charAt(i)<=96){
                char c = (char) (s.charAt(i)+32);
                str.append(c);
            }
            else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}

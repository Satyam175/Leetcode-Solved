public class CountOfWords {
    public static void main(String[] args) {
        System.out.println(getCount("SatyamKaushikSaysHello"));

    }
    private static int getCount(String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>=65 && str.charAt(i)<=96){
                count++ ;
            }
        }
//        Stream Solutions
        int count2 = (int) str.chars().filter(e -> e>=65 && e<=96).count();
//        another one
        int count3 = (int) str.chars().filter(e-> Character.isUpperCase(e)).count();

        return count3;
    }
}

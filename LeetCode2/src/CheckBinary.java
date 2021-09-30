public class CheckBinary {
    public static void main(String[] args) {
//        checkBinary(1);
//        checkBinary(1011);
//        checkBinary(2101);
//        checkBinary(234501);
//        checkBinary(10110110);

//        isBin(0);
//        isBin(1);
//        isBin(1011);
//        isBin(211003);
//        isBin(12201);
//        isBin(11011);

        isBinary(0);
        isBinary(1);
        isBinary(1011);
        isBinary(11011);
        isBinary(011011);
        isBinary(1234);
    }
    public static void checkBinary(int n){
        boolean isBinary = true;
        int temp = n;
        while (temp>0){
            int rem = temp%10;
            if (rem>1){
                isBinary=false;
                break;
            } else {
                temp/=10;
            }
        }
        if (isBinary){
            System.out.println(n+" is a binary number");
        } else {
            System.out.println(n+" is not a binary number");
        }
    }

    public static void isBin(int n){
        if (String.valueOf(n).matches("[0-1]+")){
            System.out.println(n+" is a binary number");
        } else {
            System.out.println(n+" is not a binary number");
        }
    }

    public static void isBinary(int n){
     try {
         Integer.parseInt(String.valueOf(n),2);
         System.out.println(n+" is a binary number");
     } catch (NumberFormatException e){
         System.out.println(n+" not a binary number");
     }
    }
}

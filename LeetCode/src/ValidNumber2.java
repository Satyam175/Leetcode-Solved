//check given number is valid or not
//check given phone number is valid - 10 digits
//check given CC number is valid - 16 digits

public class ValidNumber2 {
    public static void main(String[] args) {
        System.out.println(isPhoneNumber("12-4567890"));

        System.out.println(isNumber("-.12567890"));

//        System.out.println(isCorrectPhoneNumber("6260680914"));
//        System.out.println(isCorrectPhoneNumber("83491806825"));
    }
    public static boolean isNumber(String Number){
//        try{
//            Long.parseLong(Number);
////            System.out.println("this is valid number "+Number);
//        } catch (NumberFormatException e){
////            System.out.println("invalid number "+ Number);
//            return false;
//        }
//        return true;
        return Number.matches("^(-?\\d+\\.)?-?\\d+$");
    }
    public static boolean isPhoneNumber(String number){
        if (number.length()==10 && isNumber(number)){
            System.out.println(number + " is a valid phone number");
            return true;
        } else {
            System.out.println(number + " is invalid phone number");
            return false;
        }
    }

    public static boolean isCorrectPhoneNumber(String Number){
//        return Number.matches("[0-9]{10}");
        return Number.matches("\\d{10}");
    }
}

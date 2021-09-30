public class DeciBinary {
    public static void main(String[] args) {
        System.out.println(minPartitions("38"));
    }

    public static int minPartitions(String n){
        char best = '0';
        for (char c: n.toCharArray()){
            if (c>best) best=c;
        }
        return Integer.parseInt(String.valueOf(best));
    }
}
//A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
// For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
//
//Given a string n that represents a positive decimal integer,
// return the minimum number of positive deci-binary numbers needed so that they sum up to n.

// Idea:
// If each deci-binary number has no higher than a 1 in each position,
// then it will take at least x numbers to achieve an x in any given position of n.
// This means that the largest character in any position in n will determine how many
// deci-binary numbers
// must be added together to obtain n.
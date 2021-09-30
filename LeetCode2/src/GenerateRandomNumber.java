import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
Generate random number in java
1.Random Class
2.Math.Random
3.ThreadLocalRandom

 */
public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0;i<5;i++){
            System.out.println(random.nextInt(5));
            System.out.println(random.nextDouble());
        }
        System.out.println("------------------------------------------------------");

        for (int i=0;i<5;i++){
            System.out.println((int)(Math.random()*40+1));
        }
        System.out.println("------------------------------------------------------");

        for (int i=0;i<5;i++){
            System.out.println(ThreadLocalRandom.current().nextInt());
            System.out.println(ThreadLocalRandom.current().nextDouble());
            System.out.println();
        }

        System.out.println("-------------------------RANGE-----------------------------");

        for (int i=0;i<5;i++){
            System.out.println(ThreadLocalRandom.current().nextInt(5,10));
        }
    }
}

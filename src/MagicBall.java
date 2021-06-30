import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("Enter your question");

        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        Random r = new Random();
        int randomNum = r.nextInt(5);

        if (randomNum == 0) {
            System.out.println("Signs point to yes");
        } else if (randomNum == 1) {
            System.out.println("As I see it, yes");
        } else if (randomNum == 2) {
            System.out.println("Reply hazy, try again");
        } else if (randomNum == 3) {
            System.out.println("Don't count on it");
        } else {
            System.out.println("Outlook not so good");
        }
    }

}

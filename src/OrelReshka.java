import java.util.Random;
import java.util.Scanner;

public class OrelReshka {
    public static void main(String[] args) {

        String yourGuess;
        //do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What's your guess: ");
            yourGuess = scanner.next();
            scanner.close();
            if (!yourGuess.equals("head") && !yourGuess.equals("tail")) {
                    System.out.println("Try again incorrect data was provided. accepted: tail, head or exit");
                    System.exit(0);}

                int tailOrHead = new Random().nextInt(2);

                if (tailOrHead == 0 && yourGuess.equals("head")
                        || tailOrHead == 1 && yourGuess.equals("tail")) {
                    System.out.println("You Win =))))))" + "head=0  and " + tailOrHead);
                } else
                    System.out.println("You loose =(((((" + "head=0  and " + tailOrHead);
        //}
        //while (!yourGuess.equals("exit"));
        }
    }




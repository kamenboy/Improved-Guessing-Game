import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("--------------------------------------------------");
        System.out.println("----- Welcome to the Number Guessing Game! ----- \n---- Every time I run this program, I pick a random number between 1-100. ----");
        System.out.println("---- If you guess correctly, you win! If you don't you continue guessing! ---- \n---- If you want to quit, type \"QUIT\" ----");
        System.out.println("------------------Let's Begin!--------------------");

        int inputNumber;
        int i = 1;
        int attemptCounter = 1;
        while (i <= 100) {
            if (scan.hasNextInt()) {
                inputNumber = scan.nextInt();
                if (inputNumber == randomNumber) {
                    System.out.println("You have guessed correctly!");
                    System.out.println("It took you " + attemptCounter + " attempts to guess correctly!");
                    break;
                } else if (inputNumber < randomNumber) {
                    System.out.println("Higher!");
                } else {
                    System.out.println("Lower!");
                }
                attemptCounter++;
                i++;
            } else {
                System.out.println("You quit!");
                break;
            }

        }
    }
}
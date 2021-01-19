import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain;

        System.out.println("Welcome to game \"High - Low\"!");
        do {
            int theNumber = (int) (Math.random() * 99 + 1);
            int guess = -1;
            int numberOfTries = 0;
            while (guess != theNumber) {
                while (true) {
                    System.out.print("Guess a number between 1 and 100: ");
                    guess = scan.nextInt();
                    if (guess > 100) {
                        System.out.println("Number doesn't fit");
                    } else if (guess < 1) {
                        System.out.println("Number doesn't fit");
                    } else {
                        numberOfTries++;
                        break;
                    }
                }

                //сравнивание и вывод результата
                if (guess > theNumber) {
                    System.out.println(guess + " is too high. Try again.");
                } else if (guess < theNumber) {
                    System.out.println(guess + " is too low. Try again.");
                } else {
                    System.out.println(guess + " is correct! You won!");
                    System.out.println("It only look you " + numberOfTries + " tries! Good work!");
                }
            }

            //запрос повторения игры
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye!");
        scan.close();
    }
}
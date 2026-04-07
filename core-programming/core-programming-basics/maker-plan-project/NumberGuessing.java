// This is the project name and it contains the game in which user has to guess the number
// genrated by program

import java.util.Scanner;

public class NumberGuessing {

    static int numberGenerator() {
        return (int) ((Math.random() * 50) + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("How many chances you want ? ");

        if (scanner.hasNextInt()) {
            int chance = scanner.nextInt();
            int randomNumber = numberGenerator();

            while (chance > 0) {
                System.out.println("Guess the number between 1 and 50 :");
                int userGuess = scanner.nextInt();
                System.out.println("Ready for result !! ");
                
                if (userGuess != randomNumber) {
                    if (userGuess > randomNumber) {
                        System.out.println("Your guess is greater than the computer generated number");
                        System.out.println("The number is " + randomNumber);
                        System.out.println("===========================================");
                        System.out.println("===========================================");
                    } else {
                        System.out.println("Your guess is lower than the computer generated number");
                        System.out.println("The number is " + randomNumber);
                        System.out.println("===========================================");
                        System.out.println("===========================================");
                    }

                } else {
                    System.out.println("===========================================");
                    System.out.println("===========================================");
                    System.out.println("You win !!");
                    System.out.println("===========================================");
                    System.out.println("===========================================");
                    break;
                }
                chance--;
                System.out.printf("%d Chances left \n", chance);
            }
        }

        else {
            System.out.println("Enter only integers");
        }
        scanner.close();

    }

}

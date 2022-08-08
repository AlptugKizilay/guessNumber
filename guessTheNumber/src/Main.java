import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(0, 100);
        //int number =(int) (Math.random() * 100);
        System.out.println(number);
        Scanner inp = new Scanner(System.in);

        int right = 5;
        boolean isWin = false;
        int[] wrongAnswers = new int[5];
        int a=0;

        while (right > 0) {
            System.out.print("Enter the guess between 0 and 100: ");
            int guess = inp.nextInt();

            if (guess > 100 || guess < 0) {
                System.out.println("Enter the number between 0 and 100");
            }
            if (number == guess) {
                isWin = true;
                break;
            } else {
                System.out.println("Wrong Number!");

                if (number < guess) {
                    System.out.println("Your guess is bigger than number!");
                } else {
                    System.out.println("Your guess is less than number! ");
                }
                right--;
                System.out.println("Remaining Right: " + (right));
                wrongAnswers[a++] = guess;
            }

        }
        if (isWin) {
            System.out.println("Congrast!");
            System.out.println("Your guesses: "+Arrays.toString(wrongAnswers));
        }else {
            System.out.println("Failed!");
            System.out.println("Your guesses: "+Arrays.toString(wrongAnswers));
        }


    }
}

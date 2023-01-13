import java.util.Scanner;

import java.lang.Math;

public class secretNumber {
    public static void main(String[] args) {

        int secretNumber = rand(1, 10);

        for (int attempts = 3; attempts > 0; attempts--){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Guess the secret number: ");
            int userGuess = userInput.nextInt();
    
            if(userGuess != secretNumber){
                System.out.println("Guess was incorrect. Try again!");
                   
                if (attempts == 0){
                    System.out.println("You've ran out of tries.");
                    System.exit(0);
                }
                
            } else {
                System.out.println("You have guessed the secret number!");
                System.exit(0);
            }

            
        }       
    }

    public static int rand(int min , int max) {
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        return randomNumber;
    }
}
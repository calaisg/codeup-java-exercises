import java.util.Random;
import util.Input;

import javax.sound.midi.SysexMessage;

public class HighLow {
    //Bonus
    //
    //Keep track of how many guesses a user makes.
    //Set an upper limit on the number of guesses.

    public static void runGuesser(){
        System.out.println("Welcome to the Game!");
        System.out.println("Guess what number I picked between 1 and 100. You have 5 guesses!");
        Input input = new Input();
        Random rand = new Random();
        int randomNumber = rand.nextInt(101 - 1) + 1;

        int guessesLeft = 5;
        while(guessesLeft > 0){
            System.out.print("Guess: ");
            int userGuess = input.getInt(1, 100);
            if(userGuess > randomNumber){
                System.out.println("LOWER");
            }
            if(userGuess < randomNumber){
                System.out.println("HIGHER");
            }
            if(userGuess == randomNumber){
                System.out.println("GOOD GUESS!");
                break;
            }
            guessesLeft -= 1;
            System.out.printf("You have %d guesses left!\n", guessesLeft);
            if(guessesLeft == 0){
                System.out.println("Better Luck Next Time!");
            }
        }
        System.out.printf("\nThe randomNumber was: %d", randomNumber);
    }

    public static void main(String[] args){
        runGuesser();
    }




}

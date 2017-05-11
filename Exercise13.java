import java.util.Random;
import java.util.Scanner;

/*
*Steven Allen
*ITSE-1302
*3/23/2017
*Exercise 13
*Code simulates the game Hi-Lo.
*/

public class HiLoGame {

    public static void main(String[] args) {
        int intGuessNumber;
        int intCounter = 1;
        
        Scanner objKeyboard = new Scanner(System.in);
        Random objRndm = new Random();
        int rndmNumber = objRndm.nextInt(100)+1;
        
        System.out.print("Enter guess: ");
            intGuessNumber = objKeyboard.nextInt();    
        
        while(intGuessNumber != rndmNumber)
        {
            if(intGuessNumber > rndmNumber)
            {
                System.out.print("\nYou guessed too high, enter new guess please: ");
                intGuessNumber = objKeyboard.nextInt();
            }
            else if(intGuessNumber < rndmNumber)
            {
                System.out.print("\nYou guessed too low, enter new guess please: ");
                intGuessNumber = objKeyboard.nextInt();
            }
            intCounter++;
        }

        System.out.println("\nCongradulations, you guessed the random number! " 
                    + rndmNumber +".");
        System.out.println("You took " + intCounter + "of tries to guess it right!");  
    }
    
}
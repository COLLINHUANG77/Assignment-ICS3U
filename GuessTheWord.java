package 喵喵喵;
import java.util.Scanner;
public class GuessTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String wordToGuess = "java";

	        char[] guessedWord = new char[wordToGuess.length()];
	        for (int i = 0; i < guessedWord.length; i++) {
	            guessedWord[i] = '_'; 
	        }

	        int attemptsLeft = 10;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Guess the Word Game!");
	        System.out.println("You have " + attemptsLeft + " attempts to guess the word.");

	        while (attemptsLeft > 0) {
	            System.out.print("\nCurrent word: ");
	            System.out.println(guessedWord); 
	            System.out.println("Attempts left: " + attemptsLeft);
	            System.out.print("Enter a letter: ");
	            
	           
	            char guess = Character.toLowerCase(scanner.next().charAt(0));

	            boolean correctGuess = false;

	          
	            for (int i = 0; i < wordToGuess.length(); i++) {
	                if (wordToGuess.charAt(i) == guess) {
	                    guessedWord[i] = guess; 
	                    correctGuess = true;
	                }
	            }

	            if (correctGuess) {
	                System.out.println("Correct guess!");
	            } else {
	                System.out.println("Wrong guess!");
	                attemptsLeft--; 
	            }

	            if (String.valueOf(guessedWord).equals(wordToGuess)) {
	                System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
	                break;
	            }
	        }

	        if (attemptsLeft == 0) {
	            System.out.println("\nGame Over! The correct word was: " + wordToGuess);
	        }

	        scanner.close();
	    }
	
	}



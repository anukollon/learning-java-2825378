import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What color is black box in a airplane?";
        String choiceOne = "Orange";
        String choiceTwo = "Black";
        String choiceThree = "Pink";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to AK Quiz!");
        System.out.println("Select the correct answer");
        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        System.out.println("Type A or B or C");
        String input = scanner.next();
              
        if(input.toLowerCase().equals(correctAnswer.toLowerCase())) {
        	System.out.println("Congrats! You got it right.");
        }
        else {
        	System.out.println("Incorrect answer. Correct answer is "+correctAnswer);
        }

        // Have the user input an answer
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        //DONE 1: Write some Java code that uses the variable pi to output the following:
            //The value of pi is approximately 3.14.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s", pi);
        System.out.println("");

        //------------
        //EXPLORE THE SCANNER CLASS

        //DONE 1: Prompt a user to enter a integer and store that value in an int variable using the
            // nextInt method. What happens if you input something that is not an integer?
                //error, exception in thread "main" java
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You Entered: --> \"" + userInput + "\" <--");

        // 2: Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
            //What happens if you enter less than 3 words?
            //What happens if you enter more than 3 words?

        //3: Prompt a user to enter a sentence, then store that sentence in a String variable using
        // the next method. Then, display that sentence back to the user.
            //Do you capture all the words?

        //4: Rewrite the above example using the nextLine method.


        //------------
        //CALCULATE THE PERIMETER AND AREA OF CODEUP'S CLASSROOM

        //1: Prompt the user to enter values of length and width of a classroom at Codeup.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.

        //2: Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width, and the perimeter
        // of a rectangle is equal to 2 times the length plus 2 times the width.











    }
}

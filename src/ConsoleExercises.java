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
        //TODO: UNCOMMENT
//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You Entered: --> \"" + userInput + "\" <--");

        // DONE: 2: Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
            //What happens if you enter less than 3 words? --> Will not continue code until three user inputs are given
            //What happens if you enter more than 3 words? --> the fourth on aren't registered/displayed
        //TODO: UNCOMMENT

//        System.out.print("Enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

        //DONE 3: Prompt a user to enter a sentence, then store that sentence in a String variable using
        // the next method. Then, display that sentence back to the user.
            //Do you capture all the words? --> No, just the first word

//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
//        System.out.println(userSentence);

        //4: Rewrite the above example using the nextLine method.
        //TODO: Ask why when run together this isn't registered, continues automatically?? UNCOMMENT

//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);


        //------------
        //CALCULATE THE PERIMETER AND AREA OF CODEUP'S CLASSROOM

        //DONE 1: Prompt the user to enter values of length and width of a classroom at Codeup.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.

//        System.out.print("Enter length of classroom: ");
//        String length = scanner.nextLine();
//        int numbLength = Integer.parseInt(length);
//        System.out.print("Enter width of classroom: ");
//        String width = scanner.nextLine();
//        int numbWidth = Integer.parseInt(width);

        //DONE 2: Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width, and the perimeter
        // of a rectangle is equal to 2 times the length plus 2 times the width.

//        int area = numbLength * numbWidth;
//        System.out.println("Area: " + area);
//        int perimeter = 2 * numbWidth + 2 * numbLength;
//        System.out.println("Perimeter: " + perimeter);

        //-----------
        //BONUSES
        //TODO: Make sure did correctly?

        //DONE In your perimeter/area calculator: - Accept decimal entries.

//        System.out.print("Enter length of classroom: ");
//        String length = scanner.nextLine();
//        float numbLength = Float.parseFloat(length);
//        System.out.print("Enter width of classroom: ");
//        String width = scanner.nextLine();
//        float numbWidth = Float.parseFloat(width);

//        float area = numbLength * numbWidth;
//        System.out.println("Area: " + area);
//        float perimeter = 2 * numbWidth + 2 * numbLength;
//        System.out.println("Perimeter: " + perimeter);

        // DONE Calculate the volume of the rooms in addition to the area and perimeter.

//        System.out.print("Enter depth of classroom: ");
//        float depth = scanner.nextFloat();
//        float volume = depth * numbWidth * numbLength;
//        System.out.println("Volume: " + volume);

        //DONE: The Scanner class can be told specifically what characters or pattern separates tokens in a
        // piece of input with the useDelimiter method. Add the following line of code to your
        // application after you have created a scanner (assuming the variable holding the Scanner
        // is named scanner):
            //How does this change the way your program operates? --> It didn't?

        //Rewrite your classroom program to use nextInt method. If you added the line of code
        // above to your application, you should now have no trouble handling multiple pieces of
        // user input.

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter length:");
        int length = scanner.nextInt();
        System.out.print("Enter width:");
        int width = scanner.nextInt();
        System.out.print("Enter volume:");
        int depth = scanner.nextInt();

        float area = length * width;
        System.out.println("Area: " + area);
        float perimeter = 2 * width + 2 * length;
        System.out.println("Perimeter: " + perimeter);
        float volume = depth * width * length;
        System.out.println("Volume: " + volume);

    }
}

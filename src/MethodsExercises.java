import java.util.Scanner;
import java.lang.*;

public class MethodsExercises {

    //TODO: public static scanner - can share the scanner here instead of redoing it everytime
    public static void main(String[] args){

        //Questions:
            //DONE: continue in a method or in main?
                //DONE: Follow up, new scanner each method?
            //TODO: Get #2 getInt clarification
            //TODO: #4 issues with %d%n --> why not working
            //TODO: check if did four correct

        //1 Arithmetic
//        System.out.println("----Exercise 1: Arithmetic----");
//        addition(5, 5);
//        subtraction(5, 5);
//        multiplication(5, 5);
//        division(5, 5);
//        modulus(5, 5);

        //2 Validates user input is in a Certain range
        System.out.println("----Exercise 2: Validate Range----");
        getInteger(1, 10);

//        //3 Factorial
//        System.out.println("----Exercise 3: Factorial----");
//        askFactorial();

        //4
//        System.out.println("----Exercise 4: Dice----");
//        userDice();

    }

    //--------------------
    //TODO: 4: Create an application that simulates dice rolling.
    public static void userDice(){
        Scanner scanner = new Scanner(System.in);

        //Prompt user for sides of die
        System.out.println("Enter the number of sides for the pair of die: " );
        int sides = scanner.nextInt();
        scanner.nextLine(); //nextInt is weird --> this solves issue of not reading next Line

        //prompt user to roll, continue until user presses correct button
        boolean roll = false;
        while(!roll){
            System.out.println("Roll the Dice! (Press Enter)");
            String answer = scanner.nextLine();
            if(answer.equals("")){
                System.out.println("Total Roll: " + rollDie(sides));
                roll = true;
            }
            else{
                System.out.println("Error! Please Press *Only* the Enter Key!");
            }
        }

        //ask user if they want to go again
        System.out.println("Do you want to roll again? (Y/N)");
        String response = scanner.nextLine();
        if(response.equals("y") || response.equals("Y")){
            userDice();
        }
        else if(response.equals("n") || response.equals("N")){
            System.out.println("Ending Method.");
        }
        else{
            System.out.println("Response not recognized; Ending Method.");
        }

    }

    //TODO: Use static methods to implement the method(s) that generate the random numbers.
    public static int rollDie(int max){
        int firstRoll = (int)(Math.random() * max + 1);
        System.out.println("First Roll: " + firstRoll);
        int secondRoll = (int)(Math.random() * max + 1);
        //TODO: why doesn't work?
//        System.out.println("Second Roll: %d%n", secondRoll);
        return (firstRoll + secondRoll);
    }


    //--------------------
    //TODO: 3: Calculate the factorial of a number.

    //ask factorial, just ask, if not signal caller to not do it
    // in main, can do loop if facotiral is true, so ask factorial return boolean to keep asking or no
    //keep going bool
    //keeps functions more simple and do what need to do

    public static void askFactorial(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer from 1-10: ");
        int input = scanner.nextInt();
        scanner.nextLine(); //nextInt is weird --> this solves issue of not reading next Line

        //TODO: Assume that the user will enter an integer, but verify it’s between 1 and 10. - call getInt when done
        System.out.println(factorial(input));

        //asks if user wants to continue
        //TODO: rework it to be while loop rather than recursion
        System.out.println("Do you want to continue? (Y/N)");
        String factAnswer = scanner.nextLine();
        if(factAnswer.equals("y") || factAnswer.equals("Y")){
            askFactorial();
        }
        else if(factAnswer.equals("n") || factAnswer.equals("N")){
            System.out.println("Ending Method.");
        }
        else{
            System.out.println("Response not recognized; Ending Method.");
        }
    }

    public static long factorial(int number){
        long factorial = 1;
        for(double i = number; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
    //TODO: Bonus
        //Test the application and find the integer for the highest factorial that can
            // be accurately calculated by this application, then modify the prompt
            // so that it prompts the user for a number "from 1 to {the highest integer
            // that returns accurate factorial calculation}". Don’t forget to change your
            // verification too!
        //Use recursion to implement the factorial

    //--------------------
    //DONE 2: Create a method that validates that user input is in a certain range
    public static void getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);

        //Prompt User for Integer
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int userNumber = scanner.nextInt();

        //checks if in range, if not prompt user to try again
        if(userNumber >= min && userNumber <= max){
            System.out.println("Success! Number is within set range.");
        }
        else{
            System.out.println("Error! Input is invalid/out of set range");
            getInteger(min, max);
        }
    }

    //--------------------
    //1 Basic Arithmetic
    public static void addition(int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber);
    }

    public static void subtraction(int firstNumber, int secondNumber){
        System.out.println(firstNumber - secondNumber);
    }

    //TODO BONUS
    public static void multiplication(int firstNumber, int secondNumber){
        //with recursion
        if(secondNumber == 0){
            System.out.println(firstNumber);
            return;
        }
        else{
            firstNumber += firstNumber;
            secondNumber--;
            multiplication(firstNumber, secondNumber);
        }

        //without the * operator
//        for(int i = 0; i < secondNumber; i++){
//            total += firstNumber;
//        }
//        System.out.println(total);

        //first way (easy way)
//            System.out.println(firstNumber * secondNumber);
    }

    public static void division(int firstNumber, int secondNumber){
        System.out.println(firstNumber / secondNumber);
    }

    public static void modulus(int firstNumber, int secondNumber){
        System.out.println(firstNumber % secondNumber);
    }




















}

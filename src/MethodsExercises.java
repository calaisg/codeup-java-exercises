import java.util.Scanner;
import java.lang.*;

public class MethodsExercises {

    //---------------------------------------------------------------------------------------
    //DONE 1 Basic Arithmetic
        public static double addition(double firstNumber, double secondNumber){
            return firstNumber + secondNumber;
        }

        public static double subtraction(double firstNumber, double secondNumber){
            return firstNumber - secondNumber;
        }

        public static double multiplication(double firstNumber, double secondNumber){
            //without the * operator
            double total = 0;
            for(int i = 0; i < secondNumber; i++){
                total += firstNumber;
            }
            return total;

            //first way (easy way)
                //return firstNumber * secondNumber;
        }

        public static double division(double firstNumber, double secondNumber){
            return firstNumber / secondNumber;
        }

        public static double modulus(double firstNumber, double secondNumber){
            return firstNumber % secondNumber;
        }

    //---------------------------------------------------------------------------------------
    //DONE 2: Create a method that validates that user saturdaySessions.input is in a certain range

        //checks if saturdaySessions.input is within range
        public static int getInteger(int min, int max){
            Scanner scanner = new Scanner(System.in);

            //Prompt User for Integer
            System.out.println("Enter a number between " + min + " and " + max + ":");
            int userNumber = scanner.nextInt();
            scanner.nextLine();

            //checks if in range, if not prompt user to try again
            if(userNumber >= min && userNumber <= max){
                return userNumber;
            }
            else{
                System.out.println("Error! Number is not within range.");
                return getInteger(min, max);
            }
        }

    //---------------------------------------------------------------------------------------
    //DONE 3: Calculate the factorial of a number.

        //asks user for factorial
        public static void askFactorial(){
            Scanner scanner = new Scanner(System.in);

            int input = getInteger(1, 20);
            System.out.println(factorial(input));

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

        //calculates factorial
        public static long factorial(int number){
            long factorial = 1;
            for(double i = number; i > 0; i--){
                factorial *= i;
            }
            return factorial;
        }

    //---------------------------------------------------------------------------------------
    //DONE 4: Create an application that simulates dice rolling.

        //confirms if want to keep rolling die
        public static void confirmDice(){
            Scanner scanner = new Scanner(System.in);
            boolean stillGoing = true;
                while(stillGoing){
                    userDice();
                    System.out.println("Do you want to roll again? (Y/N)");
                    String response = scanner.nextLine();
                    if(response.equals("n") || response.equals("N")){
                        System.out.println("Ending Method.");
                        stillGoing = false;
                    }
                    else if(!response.equals("y") && !response.equals("Y")){
                        System.out.println("Response not recognized; Ending Method.");
                        stillGoing = false;
                    }
                }
        }

        //asks user for die info
        public static void userDice(){
            Scanner scanner = new Scanner(System.in);

            //Prompt user for sides of die
            System.out.println("Time to pick the number of sides for the dice!");
            int sides = getInteger(1, 20);

            //prompt user to roll, continue until user presses correct button
            boolean roll = false;
            while(!roll){
                System.out.println("Roll the Dice! (Press Enter)");
                String answer = scanner.nextLine();
                if(answer.equals("")){
                    System.out.println("Total Roll: " + rollDice(sides));
                    roll = true;
                }
                else{
                    System.out.println("Error! Please Press *Only* the Enter Key!");
                }
            }
        }

    //calculates roll
    public static int rollDice(int max){
        int firstRoll = (int)(Math.random() * max + 1);
        System.out.println("First Roll: " + firstRoll);
        int secondRoll = (int)(Math.random() * max + 1);
        System.out.println("Second Roll: "+ secondRoll);
        return (firstRoll + secondRoll);
    }

    //---------------------------------------------------------------------------------------
    //Main Function
    public static void main(String[] args){

        //1 Arithmetic
//        System.out.println("----Exercise 1: Arithmetic----");
//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(5, 5));
//        System.out.println(multiplication(5, 5));
//        System.out.println(division(5, 5));
//        System.out.println(modulus(5, 5));


        //2 Validates user saturdaySessions.input is in a Certain range
//        System.out.println("----Exercise 2: Validate Range----");
//        System.out.println("Success!" + getInteger(1, 15) + "is within range!");


        //3 Factorial
//        System.out.println("----Exercise 3: Factorial----");
//        askFactorial();


        //4 Roll Dice
//        System.out.println("----Exercise 4: Dice----");
//        confirmDice();
    }
}

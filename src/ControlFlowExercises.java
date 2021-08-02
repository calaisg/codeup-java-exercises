import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //1 Loop Basics
        //a. While
//        System.out.println("Exercise 1a:");
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        ;
//        System.out.println(" ");

//
//        //b. Do While
//        System.out.println(" ");
//        System.out.println("Exercise 1b: ");
//        //Create a do-while loop that will count by 2's starting with 0 and ending at 100.
//        // Follow each number with a new line.
//        int starting = 0;
//        do {
//            System.out.print(starting + "\n");
//            starting += 2;
//        } while (starting < 101);
//        System.out.println("");
//
//        //Alter your loop to count backwards by 5's from 100 to -10.
//        int ending = 100;
//        do {
//            System.out.print(ending + "\n");
//            ending -= 5;
//        } while (ending > -11);
//        System.out.println("");
//
//        //Create a do-while loop that starts at 2, and displays the number squared on
//        // each line while the number is less than 1,000,000.
//        long multipl = 2;
//        do {
//            System.out.println(multipl);
//            multipl = multipl * multipl;
//        } while (multipl < 1000000);


//        //c. For
//        System.out.println("");
//        System.out.println("Exercise 1c: ");
//        //Refactor the previous two exercises to use a for loop instead.
//
//        for (int number = 5; number <= 15; number++) {
//            System.out.print(number + " ");
//        }
//        ;
//        System.out.println("");
//
//        for (int newStarting = 0; newStarting < 101; newStarting += 2) {
//            System.out.print(newStarting + "\n");
//        }
//        ;
//        System.out.println("");
//
//        for (int newEnding = 100; newEnding > -11; newEnding -= 5) {
//            System.out.print(newEnding + "\n");
//        }
//        ;
//        System.out.println("");
//
//        for (long newMultiple = 2; newMultiple < 100000; newMultiple *= newMultiple) {
//            System.out.println(newMultiple);
//        }
//        ;

        //-------------
        //DONE: 2 Fizzbuzz
//        System.out.println(" ");
//        System.out.println("Exercise 2");
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.
//
//            for (int starter = 0; starter < 101; starter++) {
//                if (starter % 3 == 0 && starter % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                }
//                else if(starter % 3 == 0){
//                    System.out.println("Fizz");
//                }
//                else if(starter % 5 == 0){
//                    System.out.println("Buzz");
//                }
//                else{
//                    System.out.println(starter);
//                }
//            }

        //-------------
        //3 Display a table of powers
        System.out.println(" ");
        System.out.println("Exercise 3");
        //Table format maintained up till 9999
        //Display a table of powers.
        //DONE: Prompt the user to enter an integer.
        //DONE: Display a table of squares and cubes from 1 to the value entered.
        //DONE: Ask if the user wants to continue.
        //DONE: Assume that the user will enter valid data.
        //DONE: Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);

        boolean moreTables = false;

        while (!moreTables) {
            System.out.print("What number would you like to go up to? ");
            int userNumb = Integer.parseInt(scanner.next());

            System.out.println("Here is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            int inputLength;
            for (int input = 1; input <= userNumb; input++) {
                //first column
                inputLength = String.valueOf(input).length();
                if (inputLength == 1) {
                    System.out.print(input + "      | ");
                } else if (inputLength == 2) {
                    System.out.print(input + "     | ");
                } else if (inputLength == 3) {
                    System.out.print(input + "    | ");
                } else if (inputLength == 4) {
                    System.out.print(input + "    | ");
                } else if (inputLength > 4) {
                    System.out.print(input + "      | ");
                }

                //second column
                int squared = input * input;
                int squaredLength = String.valueOf(squared).length();
                if (squaredLength == 1) {
                    System.out.print(squared + "       | ");
                } else if (squaredLength == 2) {
                    System.out.print(squared + "      | ");
                } else if (squaredLength == 3) {
                    System.out.print(squared + "     | ");
                } else if (squaredLength == 4) {
                    System.out.print(squared + "     | ");
                } else if (squaredLength > 4) {
                    System.out.print(squared + "       | ");
                }

                //third column
                int cubed = input * input * input;
                System.out.print(cubed + "\n");
            }

            //check if user wants to continue
            System.out.println("Do you want to enter another number? (Y/N)");
            String userAnswer = scanner.next();
            if (!userAnswer.equals("Y") && !userAnswer.equals("y")) {
                moreTables = true;
                System.out.println("See you next time!");
            }
        }


            //-------------
            //DONE 4 Convert given number grades into letter grades
//        System.out.println(" ");
//        System.out.println("Exercise 4");
//            //Prompt the user for a numerical grade from 0 to 100.
//            //DONE: Display the corresponding letter grade.
//            //DONE: Prompt the user to continue.
//            //DONE: Assume that the user will enter valid integers for the grades.
//            //DONE: The application should only continue if the user agrees to.
//
//        boolean still = false;
//
//        while(!still){
//            System.out.print("Enter a grade from 0 to 100: ");
//            int grade = scanner.nextInt();
//
//            if(grade >= 88){
//                System.out.println("Grade is an A");
//            }
//            else if(grade < 88 && grade >= 80){
//                System.out.println("Grade is a B");
//            }
//            else if(grade < 80 && grade >=67){
//                System.out.println("Grade is a C");
//            }
//            else if(grade < 79 && grade >=60){
//                System.out.println("Grade is a D");
//            }
//            else if(grade < 60 && grade >= 0){
//                System.out.println("grade is an F");
//            }
//            else{
//                System.out.println("Error: Invalid numeric grade. Please enter a number between 0 and 100");
//            }
//
//            System.out.println("Do you have another grade to enter? (Y/N)");
//            scanner.nextLine();
//            String answer = scanner.nextLine();
//            if(!answer.equals("Y") && !answer.equals("y")){
//                still = true;
//                System.out.println("See you later!");
//            }
//        }
        }
    }



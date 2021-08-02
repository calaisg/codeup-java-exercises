public class ControlFlowExercises {
    public static void main(String[] args){

    //1 Loop Basics
        //a. While
            System.out.println("Exercise 1a:");
            int i = 5;
            while(i <= 15){
                System.out.print(i + " ");
                i++;
            };
            System.out.println("");
            System.out.println("");

       //b. Do While
            System.out.println("Exercise 1b: ");
            //Create a do-while loop that will count by 2's starting with 0 and ending at 100.
            // Follow each number with a new line.
            int starting = 0;
            do{
                System.out.print(starting + "\n");
                starting += 2;
            }while(starting < 101);
            System.out.println("");

           //Alter your loop to count backwards by 5's from 100 to -10.
            int ending = 100;
            do{
                System.out.print(ending + "\n");
                ending -= 5;
            }while(ending > -11);
            System.out.println("");

            //Create a do-while loop that starts at 2, and displays the number squared on
            // each line while the number is less than 1,000,000.
            long multipl = 2;
            do{
                System.out.println(multipl);
                multipl = multipl * multipl;
            }while(multipl < 1000000);
        System.out.println("");
        //c. For
            System.out.println("Exercise 1c: ");
            //Refactor the previous two exercises to use a for loop instead.

            for(int number = 5; number <= 15; number++){
              System.out.print(number + " ");
            };
            System.out.println("");

            for(int newStarting = 0; newStarting < 101; newStarting += 2){
                System.out.print(newStarting + "\n");
            };
            System.out.println("");

            for(int newEnding = 100; newEnding > -11; newEnding -=5){
                System.out.print(newEnding + "\n");
            };
            System.out.println("");

            for(long newMultiple = 2; newMultiple < 100000; newMultiple *= newMultiple ){
                System.out.println(newMultiple);
            };
    }
}

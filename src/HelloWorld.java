public class HelloWorld {
    public static void main(String[] args){
        //DONE 1:Create an int variable named myFavoriteNumber and assign your favorite
        // number to it, then print it out to the console.
        int myFavoriteNumber = 11;
        System.out.println(myFavoriteNumber);

       //DONE 2: Create a String variable named myString and assign a string value to it, then
       // print the variable out to the console.

        String myString ="Chanel is a stinky Baby";
        System.out.println(myString);

        //DONE 3:Change your code to assign a character value to myString. What do you notice?
             //It worked, nothing changed

        //DONE 4:Change your code to assign the value 3.14159 to myString. What happens?
             //If no quotes, incompatible type; if in quotes, np np

        //DONE 5: Declare an long variable named myNumber, but do not assign anything to it.
        // Next try to print® out myNumber to the console. What happens?
            //says variable has not been initialized

            //float myNumber = 3.14;
            //System.out.println(myNumber);

        //DONE 6: Change your code to assign the value 3.14 to myNumber. What do you notice?
            //Incompatible types: possible lossy conversion from double to long

        //DONE 7: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
            //Works bc: "L suffix tells the compiler that we have a long number literal"

        //DONE: 8: Change your code to assign the value 123 to myNumber.
        //Why does assigning the value 3.14 to a variable declared as a long not compile,
        // but assigning an integer value does?
            //Works, iDK why lol

        //DONE 9: Change your code to declare myNumber as a float. Assign the value 3.14 to it.
        // What happens? What are two ways we could fix this?
            //Incompatible types: possible lossy conversion from double to float

        //DONE: 10: Copy and paste the following code blocks one at a time and execute them
        //  What is the difference between the below code blocks? Explain why the code outputs what it does.
            //first one prints 6, then adds, then prints out 6
            //seonc one adds, then prints 6, then prints 6 again

//        int x = 5;
//        System.out.println(x++); //5
//        System.out.println(x); //6

            int x = 5;
            System.out.println(++x); //6
            System.out.println(x); // 6


        //DONE 11: Try to create a variable named class. What happens?
            //class fingers = 5;

        //DONE: 12 Object is the most generic type in Java. You can assign any value to a variable of type Object.
        // What do you think will happen when the following code is run?
        //Copy and paste the code above and then run it. Does the result match with your expectation?
            //says string can't be cast to class integer

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;  //says string can't be cast to class integer
//        int three = (int) "three";   //says string can't be converted to int

       // DONE 13: Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5; --> x += 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x; --> y *= x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y; --> x /= y;
//        y = y - x; --> y -= x

        //DONE: 14: What happens if you assign a value to a numerical variable that is larger (or smaller)
             // than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the
             // maximum value for the int type.


    }
}

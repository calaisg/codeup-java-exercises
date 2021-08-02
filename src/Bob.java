import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

    //1: Create a class named Bob with a main method for the following exercise.
    //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        // DONE: Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //DONE: He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //TODO: He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
            //TODO: can't pass empty input?
        //DONE: He answers 'Whatever.' to anything else.
    //Write the Java code necessary so that a user of your command line application can have a
    // conversation with Bob.

        //TODO: Make a loop once know if new scanner for each one needed or not!
    Scanner sc = new Scanner(System.in);
    System.out.println("I'm Bob...do you need something?");
    String input = sc.next();
    if (input.equals(" ")){
        System.out.println("Fine. Be that way!");
    }
    else if(input.endsWith("?")){
        System.out.println("Sure.");
    }
    else if(input.endsWith("!")){
        System.out.println("Woah, chill out!");
    }
    else{
        System.out.println("Whatever.");
    };

    }
}

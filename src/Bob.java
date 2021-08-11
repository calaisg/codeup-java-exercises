import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

    //DONE: Create a class named Bob with a main method for the following exercise.
    //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        // DONE: Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //DONE: He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //DONE: He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //DONE: He answers 'Whatever.' to anything else.
    //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
    Scanner sc = new Scanner(System.in);
    System.out.println("I'm Bob...do you need something? (Y/N)");
    String answer = sc.nextLine();

    if(answer.equals("Y") || answer.equals("y")){
        boolean checking = true;
        while(checking){
            System.out.println("Ugh...what do you need?");
            String input = sc.nextLine();
            //next looks for token (non whitespace)
            //next line to fix (?) see what gives you
            if (input.equals("")){
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

            System.out.println("...do you need something else? (Y/N)");
            String stillGoing = sc.nextLine();
            if(!stillGoing.equals("Y") && !stillGoing.equals("y")){
                System.out.println(".....get out of my room");
                System.exit(0);
            };
        }
    }
    else if (answer.equals("N") || answer.equals("n")){
        System.out.println("Ugh, why did you interrupt me then?");
    }
    else{
        System.out.println("Idk what you're talking about, leave me alone");
    }








    }
}

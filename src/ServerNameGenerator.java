import java.lang.reflect.Array;
import java.util.Random;

public class ServerNameGenerator{

    //Create two arrays whose elements are strings: one with at least 10 adjectives,
    // another with at least 10 nouns.
        public static String[] adjectives = {"adorable", "anxious", "awkward", "blushing", "brainy", "cautious", "clever", "clumsy", "cute", "quirky"};
        public static String[] nouns = {"dog", "cat", "bird", "bearded-dragon", "gekko", "fish", "otter", "hamster", "turtle", "mouse"};


    //Create a method that will return a random element from an array of strings.
    public static String randomElement(String[] input){
        Random rand = new Random();
        int random = rand.nextInt(input.length);
        return input[random];
    }

    //Add a main method, and inside of your main method select and random noun and adjective and
    // hyphenate the combination and display the generated name to the user.

    public static void main(String[] args){
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
















}

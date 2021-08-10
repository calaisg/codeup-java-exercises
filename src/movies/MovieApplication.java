package movies;

import util.Input;

public class MovieApplication {

    public static void main(String[] args){
        boolean continueRunning = true;
        while(continueRunning){
            System.out.println(displayMenu());
            continueRunning = displayUserChoice(userChoice());
        }
    }

    //DISPLAYS MENU
    private static String displayMenu(){
        String menu = "What would you like to do? \n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n";
        return menu;
    }

    //PROMPT USER FOR CHOICE
    private static int userChoice(){
        Input input = new Input();
        int choice = input.getInt(0, 5);
        return choice;
    }


    //DISPLAY MOVIES WITH SELECTED CATEGORY
    private static void displayMovieGenre(String category){
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }



    //EXECUTE USER CHOICE
    private static boolean displayUserChoice(int userChoice){
        boolean running = true;
        switch(userChoice){
            case 0:
                System.out.println("Now Exiting. Goodbye!");
                running = false;
                break;
            case 1:
                System.out.println("\n");
                for(Movie movie : MoviesArray.findAll()){
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                displayMovieGenre("animated");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                displayMovieGenre("drama");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                displayMovieGenre("horror");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                displayMovieGenre("scifi");
                System.out.println("\n");
                break;
        }
        return running;
    }
}
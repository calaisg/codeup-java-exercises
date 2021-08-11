package saturdaySessions;

public class MusicianApp {

    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println(returnMenuDisplay());
            running = executeUserChoice(promptUserForChoice());
        }

    }

    //RETURN MENU DISPLAY
    private static String returnMenuDisplay(){
        String choices = "What would you like to do?\n" +
                "\n" +
                "0 - Exit\n" +
                "1 - View All Musicians\n" +
                "2 - View Jazz Musicians\n" +
                "3 - View Blues Musicians\n" +
                "4 - View Rock Musicians\n" +
                "5 - View Pop Musicians\n" +
                "6 - View Hip-Hop/Rap Musicians";

        return choices;
    }

    //PROMPT USER FOR CHOICE
    private static int promptUserForChoice(){
        InputSat input = new InputSat();
        int response = input.getInt(0, 6);
        return response;
    }

    private static void viewMusiciansByGenre(String genre){
           for (Musician musician: MusiciansArray.findAll())     {
               if(musician.getGenre().equalsIgnoreCase(genre)){
                System.out.printf("%s -- %s -- %s\n", musician.getFirstName(), musician.getGenre(), musician.getInstrument());
               }
           }

    }

    private static boolean executeUserChoice(int choice){
        boolean continueRunningApp = true;

        switch(choice){
            case 0:
                System.out.println("Good Bye \\m/");
                continueRunningApp = false;
                break;
            case 1:
                System.out.println("\n");
                for (Musician musician: MusiciansArray.findAll())  {
                    System.out.printf("%s -- %s -- %s\n", musician.getFirstName(), musician.getGenre(), musician.getInstrument());
                }
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                viewMusiciansByGenre("jazz");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                viewMusiciansByGenre("blues");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                viewMusiciansByGenre("rock");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                viewMusiciansByGenre("pop");
                System.out.println("\n");
                break;
            case 6:
                System.out.println("\n");
                viewMusiciansByGenre("hip-hop/rap");
                System.out.println("\n");
                break;

        }

        return continueRunningApp;

    }
}
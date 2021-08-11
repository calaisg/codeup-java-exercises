package groceryList;
import grades.Student;
import util.*;

import java.util.HashMap;

public class GroceryApplication {

    //prompts user for item
    public static void promptUserForItem(HashMap<Item, String> groceryList){
        boolean continuePrompting = true;
        while(continuePrompting){
            addToGroceryList(groceryList);
            continuePrompting = askUserToContinue();
        }
        displayGroceryList();
    }

    //create new Item on the grocery list with user input
    public static void addToGroceryList(HashMap<Item, String> groceryList){
        System.out.println("Enter an Item: ");
        Input input = new Input();
        String userItem = input.getString();
        System.out.println("Enter Quantity of Item: ");
        int userItemQuantity = input.getInt();
    }

    //ask if the user wants to continue - if non-valid choice is made, keep prompting user
    public static boolean askUserToContinue(){
        boolean keepRunning = true;
        boolean continueUser = false;
        while(keepRunning){
            System.out.println("\nWhat would you like to do next?\n" +
                    "0 -Finalize the list\n" +
                    "1 - Add Another Item");

            Input input = new Input();
            int userChoice = input.getInt();

            switch (userChoice){
                case 0:
                    keepRunning = false;
                    continueUser = false;
                    break;
                case 1:
                    keepRunning = false;
                    continueUser = true;
                    break;
                default:
                    System.out.println("Error: Input Not Recognized. Please Try Again");
                    break;
            }
        }
        return continueUser;
    }

    //display Grocery List when finished adding items
    public static void displayGroceryList(){
        System.out.println("Grocery List");
        System.out.println("\nEnding Method. Goodbye!");
    }


    public static void main(String[] args){
        HashMap<Item, String> groceryList = new HashMap<>();

        //prompts if want to make grocery list
        System.out.println("Would you like to create a grocery list?");
        Input input = new Input();
        boolean makeList = input.yesNo();
        if(!makeList){
            System.out.println("\nEnding Method. Goodbye!");
            System.exit(0);
        }

        //prompts if user wants to add an item to the list
        System.out.println("Would you like to add an item to the list?");
        boolean response = input.yesNo();
        if(response){
            promptUserForItem(groceryList);
        }
        else{
            System.out.println("\nEnding Method. Goodbye!");
        }

    }
}

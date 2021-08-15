package lectures.exceptions;

import util.Input;

import java.util.InputMismatchException;

public class MyApp {
    public static final int INVALID_CHOICE = 0;
    public static final int EXIT_CHOICE = 3;

    public void runMyApp(){
        int userChoice = INVALID_CHOICE;
        Input input = new Input();
        do{
            printMenu();

           try{
               userChoice = input.getInt(1,3);
           } catch(InputMismatchException e){
               System.out.println("Please enter an integer between 1 and 3");
           }

        }while(userChoice!= EXIT_CHOICE);

    }

    private void printMenu(){
        System.out.println("Enter 1 or 2 or 3");
    }


    public static void main(String[] args){

        //1: create an application object
        //2: run the menu loop
        //3: exit the program when the user enters quit option

        MyApp myApp = new MyApp(); //1
        myApp.runMyApp(); //2
        System.out.println("End of Program"); //3
    }

}

package pizza;

import java.util.ArrayList;
import java.util.List;
import util.Input;

//Make a PizzaShop class. This class will have your main() method for the program.
public class PizzaUser {
    //Write a static method in the PizzaShop class to make some pizza.
    // The method should return an ArrayList of Pizza.
    // Have the method store a few different types of pizza in the array list before returning it.

    public static ArrayList<Pizza> makePizza(){
        List<Pizza> list = new ArrayList<Pizza>();
        System.out.println("Select Pizza Type:\n" +
                        "1 - Cheese" +
                        "2 - Pepperoni" +
                        "3 - Supreme" +
                        "4 - Hawaiian" +
                        "5 - Veggie Lovers" +
                        "6 - Custom" +
                        "7 - Exit");
        Input input = new Input();
        int typeChoice = input.getInt(1, 7);
        String pizzaType = pizzaType(typeChoice);

        System.out.println("Select Pizza Size:\n" +
                "1 - Small" +
                "2 - Medium" +
                "3 - Large" +
                "4 - Extra Large" +
                "5 - Cancel Order & Exit");
        int sizeChoice = input.getInt(1, 5);
        String sizeType = sizeType(typeChoice);

        System.out.println("Select Crust Type:\n" +
                "1 - Thin" +
                "2 - HandTossed" +
                "3 - Pan" +
                "4 - Cancel Order & Exit");
        int crustChoice = input.getInt(1, 4);
        String crustType = crustType(crustChoice);

        //now have all things, how to store it as object
        list.add(new Pizza(pizzaType, sizeType, crustType));

        return

    }


    //get and set pizza type
    public static String pizzaType(int choice){
        String type = "";
        switch (choice){
            case 1:
                type = "Cheese";
                break;
            case 2:
                type = "Pepperoni";
                break;
            case 3:
                type = "Supreme";
                break;
            case 4:
                type = "Hawaiian";
                break;
            case 5:
                type = "Veggie Lovers";
                break;
            case 6:
                type = "Custom";
                break;
            case 7:
                type = "Exit";
                break;
        }
        return type;
    }


    //get and set size type
    public static String sizeType(int choice){
        String size = "";
        switch (choice){
            case 1:
                size = "Small";
                break;
            case 2:
                size = "Medium";
                break;
            case 3:
                size = "Large";
                break;
            case 4:
                size = "Extra Large";
                break;
            case 5:
                size = "Exit";
                break;
        }
        return size;
    }

    //get and set crust type
    public static String crustType(int choice){
        String crust = "";
        switch (choice){
            case 1:
                crust = "Thin";
                break;
            case 2:
                crust = "HandTossed";
                break;
            case 3:
                crust = "Pan";
                break;
            case 5:
                crust = "Exit";
                break;
        }
        return crust;
    }

    //Next, write a printPizza method that takes an ArrayList of Pizza and prints out the pizzas in the ArrayList.
    public static void printPizza(ArrayList<Pizza> Pizzas){
        System.out.println("Pizzas (type, crust, size:");
        for(Pizza pizza: Pizzas){
            System.out.println(pizza.getPizzaType() + " " + pizza.getCrustType() + " " + pizza.getSize());
        }
    }

    public static void main(String[] args) {
        printPizza(makePizza());

    }
}
package pizza;

import java.util.ArrayList;
import java.util.List;
import util.Input;
public class PizzaShop {

    public static ArrayList<Pizza> makePizza(){
        ArrayList<Pizza> list = new ArrayList<Pizza>();
        Pizza p1 = new Pizza("Peperoni", "Small", "Thin");
        Pizza p2 = new Pizza("Supreme", "Large", "Regular");
        Pizza p3 = new Pizza("Cheese", "Medium", "Pan");
        Pizza p4 = new Pizza("Veggie", "Small", "Thin");

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        return list;
    }
    //Next, write a printPizza method that takes an ArrayList of Pizza and prints out the pizzas in the ArrayList.
    public static void printPizza(ArrayList<Pizza> Pizzas){
        System.out.println("Available Pizzas: ");
        for(Pizza pizza: Pizzas){
            System.out.println(pizza.getPizzaType() + " | " + pizza.getCrustType() + " | " + pizza.getSize());
        }
    }

    public static void main(String[] args) {
        printPizza(makePizza());
    }
}




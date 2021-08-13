package util;

import java.util.Scanner;

public class Input {

    //Allow all of your methods for getting input to accept an optional String parameter
    // named prompt. If passed, the method should show the given prompt to the user
    // before parsing the input.

    private Scanner sc = new Scanner(System.in);

    public String getString(){
        String input = sc.nextLine();
        return input;
    }

    public boolean yesNo(){
        String answer = sc.nextLine();
        if(answer.contains("y") || answer.contains("Y")){
            return true;
        }
        else{
            return false;
        }
    }

    public int getInt(int min, int max){
        int number;
        try{
            number = Integer.valueOf(getString());
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not an integer!");
            return getInt(min, max);
        }

        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Choice Not Recognized!");
            return getInt(min, max);
        }
    }

    public int getInt(){
        try{
            return Integer.valueOf(getString());
        } catch (NumberFormatException e){
            System.out.println("Error: Input is not an integer!");
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        double number;
        try{
            number = Double.valueOf(getString());
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a double!");
            return getDouble(min, max);
        }
        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Number not in range");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        try{
            return Double.valueOf(getString());
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a double!");
            return getDouble();
        }
    }

    public int getBinary(){
        try{
            return Integer.valueOf(getString(), 2);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a number!");
            return getBinary();
        }
    }

    public int getHex(){
        try{
            return Integer.valueOf(getString(), 16);
        } catch (NumberFormatException e){
            System.out.println("Error: Input is not a number!");
            return getHex();
        }
    }

    public static void main(String[] args){
        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(1, 10));
//        System.out.println(input.getDouble(1.0, 10.0));
//        System.out.println(input.getDouble());

//            System.out.println(input.getHex());
    }
}

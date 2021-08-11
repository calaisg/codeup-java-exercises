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
        int number = sc.nextInt();
        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Choice Not Recognized!");
            return getInt(min, max);
        }
    }

    public int getInt(){
        int number = sc.nextInt();
        return number;
    }

    public double getDouble(double min, double max){
        double number = sc.nextDouble();
        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Number not in range");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        double number = sc.nextDouble();
        return number;
    }


    public static void main(String[] args){
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1, 10));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(1.0, 10.0));
        System.out.println(input.getDouble());
    }



}

import java.util.Scanner;
public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(){
        String input = sc.nextLine();
        return input;
    }

    public boolean yesNo(){
        String answer = sc.nextLine();
        if(answer.contains("y")){
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
            System.out.println("Error: Number not in range");
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        return number;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f: ", min, max);
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
        System.out.println("Enter a number: ");
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

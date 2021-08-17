package practice;

public class AssessmentPractice {


    public static double multiply(int first, int second){
        return first * second;
    }

    public static double multiply(double first, double second){
        return first * second;
    }

    public static void getMallardDetails(Mallard duck){
        System.out.println("This Mallard's flight speed is: " + duck.getFlightSpeed());
    }



    public static void main(String[] args) {
//        System.out.println(multiply(5, 1));
//        System.out.println(multiply(5.0, 1.0));

        Mallard m1 = new Mallard("Jubilee", 4, 50);
        getMallardDetails(m1);
    }









}

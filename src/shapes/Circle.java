package shapes;

public class Circle {

    private double radius;

    private static int totalCircles = 1;

    public Circle(double rad) {
        radius = rad;
        trackCircle();
    }

    public double getArea(){
        return (2 * Math.PI * radius);
    }

    public double getCircumference(){
        return (Math.PI * radius * radius);
    }

    public static int trackCircle(){
        totalCircles++;
        return totalCircles;
    }

    public static void main (String[] args){}


}

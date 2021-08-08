package shapes;

public class Rectangle {

    private double length;

    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

    public static void main(String[] args ){
        Rectangle r1 = new Rectangle(4, 5);
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
    }
}

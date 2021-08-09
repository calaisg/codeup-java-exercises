package shapes;

public class ShapesTest {

    public static void main(String[] args){
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Box1");
        System.out.println("Perimeter: "+ box1.getPerimeter());
        System.out.println("Area: " + box1.getArea());

        System.out.println("------------");

        Rectangle box2 = new Square(5);
        System.out.println("Box2");
        System.out.println("Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());

    }
}

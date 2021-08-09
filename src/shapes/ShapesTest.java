package shapes;

public class ShapesTest {

    public static void main(String[] args){

        System.out.println("myshape2 - Rectangle ");
        Measurable myShape2 = new Rectangle(4, 5);
        System.out.println("Perimeter: " + myShape2.getPerimeter());
        System.out.println("Area: " + myShape2.getArea());

        System.out.println("------");

        System.out.println("myshape2 - Square ");
        Measurable myShape = new Square(5);
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("Box1");
//        System.out.println("Perimeter: "+ box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//
//        System.out.println("------------");
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Box2");
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());

    }
}

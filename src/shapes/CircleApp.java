package shapes;
import util.Input;

import static shapes.Circle.trackCircle;

public class CircleApp {
    public static void main (String[] args){

            Input userRadius = new Input();
            double radius = userRadius.getDouble();

            Circle c1 = new Circle(radius);
            System.out.println(c1.getArea());
            System.out.println(c1.getCircumference());

    }
}

//TODO
//After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another.
// Continue creating circles and displaying information about them until the user says they do not want to continue.
//
//Before exiting, the program should output the total number of circles created. Use a private static property,
// along with a public static method to keep track of and display the total number of circles created.
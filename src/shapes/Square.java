package shapes;

public class Square extends Quadrilateral {

   protected double side;

    public Square(double side){
        super(side, side);
    }

    public static void main(String[] args){}

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return super.length * super.length;
    }
}

//INHERITANCE & POLYMORPHISM
//    public double side;
//
//    public Square(double side){
//        super(side, side);
//    }
//
//    //can just do length, but using super helps others know what doing
//    //override is good for helping annotate what doing and understanding what is going on
//
//    @Override
//    public double getArea(){
//        return super.length * super.length;
//    }
//
//    @Override
//    public double getPerimeter(){
//        return super.length * 4;
//    }

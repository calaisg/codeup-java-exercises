package shapes;

public class Square extends Quadrilateral {

   protected double side;

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }

    public static void main(String[] args){}
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

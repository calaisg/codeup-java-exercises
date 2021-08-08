package shapes;

public class Square extends Rectangle {

    public double side;

    public Square(double side){
        super(side, side);
    }

    public double getArea(){
        return super.getLength() * super.getLength();
    }

    public double getPerimeter(){
        return super.getLength() * 4;
    }

    public static void main(String[] args){}
}

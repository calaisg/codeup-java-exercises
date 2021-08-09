package shapes;

public class Square extends Rectangle {

    public double side;

    public Square(double side){
       super(side, side);
    }

   //can just do length, but using super helps others know what doing
    //override is good for helping annotate what doing and understanding what is going on

    @Override
    public double getArea(){
        return super.length * super.length;
    }

    @Override
    public double getPerimeter(){
        return super.length * 4;
    }

    public static void main(String[] args){}
}

package practice;

public class Mallard extends Duck implements Quackable{

    private int flightSpeed;

    public Mallard(String name, int age, int flightSpeed) {
        super(name, age);
        this.flightSpeed = flightSpeed;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    //encapsulation - look into
    //4 pillars - encapsulation, polymorphism, inheritance, and abstraction
}

package practice;

public class Duck {

    private String name;
    private int age;

    public Duck(String name, int age){
        if(name == null){
            throw new IllegalArgumentException();
        }

        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



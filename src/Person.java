public class Person {

    //-----------Object Basics------------
    private String name;

    public Person(String givenName) {
        setName(givenName);
    }

    public String getName(){
        return name;
    }

    public void setName(String name1){
        name = name1;
    }

    public void sayHello(){
        System.out.printf("Hello, %s!", name);
    }

    public static void main(String [] args){

    //Understanding References
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane

        //Objects Basics
//        Person p1 = new Person("Calais");
//        System.out.println(p1.getName());
//        p1.sayHello();
//        Person p2 = new Person("Jubilee");
//        System.out.println(p2.getName());
    }
}



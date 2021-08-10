public class ArraysExercises {

    public static void main(String [] args){

        //1 Array Basics
            //run the following code. What happens? --> weird stuff printed, need the .toString
                //int[] numbers = {1, 2, 3, 4, 5};
                //System.out.println(numbers);

            //Create an array that holds 3 Person objects.
            Person[] people= new Person[3];

        // Assign a new instance of the Person class to each element.
            people[0] = new Person("Chanel");
            people[1] = new Person("Jubilee");
            people[2] = new Person("Nala");

        // Iterate through the array and print out the name of each person in the array.
            for(Person individualPerson : people){
                System.out.println(individualPerson.getName());
            }
            //need get name, was getting reference to object






















    }
}

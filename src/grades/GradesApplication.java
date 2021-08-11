package grades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    //initial display of usernames
    public static void displayChoices(HashMap <String, Student> students){
        System.out.println("Welcome!\n");
        System.out.println("Here are the Github usernames of our students:\n");
        System.out.println("|NotAMorningPerson|  |TinyMenace|  |TooMuchHair|  |HairlessRat|");

        //continue asking for selected student until they say no
        boolean continueRunning = true;
        while(continueRunning){
            System.out.println("\nWhat Student would you like to see more information on?");
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.nextLine();
            continueRunning = showUserSelection(userAnswer, students);
        }
    }

    //display student answer depending on user selection
    public static boolean showUserSelection(String selection, HashMap <String, Student> students ){
        switch(selection){
            case "NotAMorningPerson":
                displaySelectedStudent(selection, students);
                break;
            case "TinyMenace":
                displaySelectedStudent(selection, students);
                break;
            case "TooMuchHair":
                displaySelectedStudent(selection, students);
                break;
            case "HairlessRat":
                displaySelectedStudent(selection, students);
                break;
            default:
                System.out.println("Sorry, no student found with the GitHub username of \"" + selection + "\"\n");
        }

        //check if user wants to continue
        System.out.println("\nWould you like to see another student?");
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();
        if(userAnswer.contains("y")){
           return true;
        }
        else{
            System.out.println("\nEnding Method. Goodbye!");
            return false;
        }
    }

    //display selected student values
    public static void displaySelectedStudent(String selection, HashMap <String, Student> students){
        System.out.println("\nName: " + students.get(selection).getName());
        System.out.println("Current Average: " + students.get(selection).getGradeAverage());
    }


    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Calais");
        s1.addGrade(90);
        s1.addGrade(92);
        s1.addGrade(93);

        Student s2 = new Student("Nala");
        s2.addGrade(50);
        s2.addGrade(60);
        s2.addGrade(75);

        Student s3 = new Student("Jubilee");
        s3.addGrade(99);
        s3.addGrade(96);
        s3.addGrade(97);

        Student s4 = new Student("Chanel");
        s4.addGrade(85);
        s4.addGrade(80);
        s4.addGrade(83);

        students.put("NotAMorningPerson", s1);
        students.put("TinyMenace", s2);
        students.put("TooMuchHair", s3);
        students.put("HairlessRat", s4);

        displayChoices(students);

    }
}

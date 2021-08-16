package grades;
import java.util.HashMap;
import java.util.Scanner;

import saturdaySessions.InputSat;
import util.*;

//TODO: Attendance

public class GradesApplication {
    //initial display of usernames
    public static void displayChoices(HashMap <String, Student> students){
        boolean continueRunning = true;
        while(continueRunning){
            System.out.println("Welcome!\n");
            System.out.println("Please Make Your Selection:\n" +
                    "0 - Exit\n" +
                    "1 - View Github Usernames of Students & Access Student Info\n" +
                    "2 - View Overall Class Average\n" +
                    "3 - Print CSV Report of All Students\n");

            //gets user choice from Input
            Input input = new Input();
            int selection = input.getInt(0, 3);
            switch(selection){
                case 0:
                    System.out.println("\nEnding Method. Goodbye!");
                    continueRunning = false;
                    break;
                case 1:
                    continueRunning = displayStudentMenu(students);
                    break;
                case 2:
                    continueRunning = displayClassAverage(students);
                    break;
                case 3:
                    continueRunning = displayCSVReport(students);
                default:
                    System.out.println("\nError: Input not Recognized. Please Try Again.");
            }

            System.out.println("\nEnding Method. Goodbye!");
        }
    }

    //if 1 selected, display student GitHub Info
    public static boolean displayStudentMenu(HashMap <String, Student> students){
        System.out.println("\nHere are the Github usernames of our students:\n");
        for(String key : students.keySet()){
            System.out.print("|" + key +  "|  ");
        }

        //continue asking for selected student until they say no
        boolean continueRunning = true;
        while(continueRunning){
            System.out.println("\nWhat Student would you like to see more information on?");
            Input input = new Input();
            String userAnswer = input.getString();
            continueRunning = showUserSelection(userAnswer, students);
        }

        //check if user wants to exit or return to main menu
        return returnToMainMenu();
    }

    //display student answer depending on user selection
    public static boolean showUserSelection(String selection, HashMap <String, Student> students ){
        if(students.containsKey(selection)){
            displaySelectedStudent(selection, students);
        }
        else{
            System.out.println("Sorry, no student found with the GitHub username of \"" + selection + "\"");
        }

        //check if user wants to check another student
        System.out.println("\nWould you like to see another student?");
        Input input = new Input();
        return input.yesNo();
    }

    //display selected student values
    public static void displaySelectedStudent(String selection, HashMap <String, Student> students){
        System.out.println("\nName: " + students.get(selection).getName());
        System.out.println("Grades: " + students.get(selection).getGrades());
        System.out.println("Current Average: " + students.get(selection).getGradeAverage());
        System.out.println("Attendance: " + students.get(selection).getAttendance());
        System.out.println("Attendance Percentage: ");
    }

    //if 2 selected, display overall class average
    public static boolean displayClassAverage(HashMap <String, Student> students){
        int total = 0;
        for(String key : students.keySet()){
            total += students.get(key).getGradeAverage();
        }
        System.out.println("Overall Class Average: " + total / students.size());

        //check if user wants to exit or return to main menu
        return returnToMainMenu();
    }

    //if 3 selected, print our CSV Report
    public static boolean displayCSVReport(HashMap <String, Student> students){
        System.out.println("\nname,github_username,average");
        for(String key : students.keySet()){
            System.out.println(students.get(key).getName() + "," + key + "," + students.get(key).getGradeAverage());
        }

        //check if user wants to exit or return to main menu
        return returnToMainMenu();
    }

    //check if user wants to return to main menu
    public static boolean returnToMainMenu(){
        System.out.println("\nDo you want to return to the main menu?");
        Input input = new Input();
        boolean userAnswer = input.yesNo();
        return userAnswer;
    }


    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Calais");
        s1.addGrade(90);
        s1.addGrade(92);
        s1.addGrade(93);
        s1.recordAttendance("2020-08-09", "P");

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
        students.putIfAbsent("TinyMenace", s2);
        students.putIfAbsent("TooMuchHair", s3);
        students.putIfAbsent("HairlessRat", s4);

        displayChoices(students);
    }
}

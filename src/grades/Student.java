package grades;
import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName){
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return studentName;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };

    // returns the average of the students grades
    public double getGradeAverage(){
        int average = 0;
        for(int grade : grades){
            average += grade;
        }
        return average / grades.size();
    };

    public static void main(String[] args){
//        Student s1 = new Student("Calais");
//        s1.addGrade(90);
//        s1.addGrade(92);
//        s1.addGrade(93);
//
//        Student s2 = new Student("Nala");
//        s2.addGrade(50);
//        s2.addGrade(60);
//        s2.addGrade(75);
//
//        Student s3 = new Student("Jubilee");
//        s3.addGrade(99);
//        s3.addGrade(96);
//        s3.addGrade(97);
//
//        Student s4 = new Student("Chanel");
//        s4.addGrade(85);
//        s4.addGrade(80);
//        s4.addGrade(83);

    }
}

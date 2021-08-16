package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String studentName){
        this.studentName = studentName;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // returns the student's name
    public String getName(){
        return studentName;
    };

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public void recordAttendance(String date, String value){
        if(value.equalsIgnoreCase("a") || value.equalsIgnoreCase("p")){
            this.attendance.put(date, value);
        }
        else{
            System.out.println("Error: Not a valid input");
        }
    }

    public double attendancePercentage(){
        int absences = 0;
        for(String key : attendance.keySet()){
            if(attendance.get(key).equalsIgnoreCase("a")){
                absences++;
            }
        }
        return (attendance.size() - absences) / attendance.size();
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int average = 0;
        for(int grade : this.grades){
            average += grade;
        }
        return average / this.grades.size();
    };

    public static void main(String[] args){ }
}

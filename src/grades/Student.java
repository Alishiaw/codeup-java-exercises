package grades;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
         this.name = name;
         grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addGrades(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGrades = 0;
        double average;

        for(int grade : grades) {
            sumOfAllGrades += grade;
        }
        average = sumOfAllGrades/ numberOfGrades;
        return average;
    }

    public static void main(String[] args) {

        System.out.println("Student Class Test");
        Student student = new Student("Annie");




    }

}

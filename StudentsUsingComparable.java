import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsUsingComparable implements Comparable<StudentsUsingComparable>{
    private String student;
    private int id;

    public StudentsUsingComparable(String student, int id) {
        this.student = student; 
        this.id = id;
    }

    // Getters and Setters

    public String getStudent() {
        return student;
    }
    public void setStudent(String student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // To print the List
    public String toString() {
        return "Name: " + student + ", ID: " + id;
    }
    

    public static void main(String[] args) {
        // New list 
        List<StudentsUsingComparable> students = List.of(
            new StudentsUsingComparable("Aansh", 10),
            new StudentsUsingComparable("Ananay", 20),
            new StudentsUsingComparable("Mark", 15));

        // Converting to Mutable
        List<StudentsUsingComparable> myStudents = new ArrayList<>(students);

        // Calling the toString()
        System.out.println(myStudents);

        // Print after sorting
        Collections.sort(myStudents);
        System.out.println(myStudents);


    }

    @Override 
    public int compareTo(StudentsUsingComparable that) {
        return Integer.compare(that.id, this.id); // for ascending (this.id, that.id)
    }
}
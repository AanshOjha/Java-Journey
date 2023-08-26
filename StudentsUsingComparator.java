import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsUsingComparator implements Comparator<StudentsUsingComparator>{
    private String student;
    private int id;

    public StudentsUsingComparator(String student, int id) {
        this.student = student; 
        this.id = id;
    }

    // Getters and Setters

    public StudentsUsingComparator() {
    }

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

        // Instance 
         StudentsUsingComparator comparator = new StudentsUsingComparator();
        
        // New list 
        List<StudentsUsingComparator> students = List.of(
            new StudentsUsingComparator("Aansh", 10),
            new StudentsUsingComparator("Ananay", 20),
            new StudentsUsingComparator("Mark", 15));

        // Converting to Mutable
        List<StudentsUsingComparator> myStudents = new ArrayList<>(students);

        // Calling the toString()
        System.out.println(myStudents);

        // Print after sorting
        // Collections.sort(myStudents);
        myStudents.sort(comparator);
        System.out.println(myStudents);


    }

    // For Comparator
    @Override
    public int compare(StudentsUsingComparator student1, StudentsUsingComparator student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }

    // For Comparable
    // @Override 
    // public int compareTo(StudentsUsingComparator that) {
    //     return Integer.compare(that.id, this.id); // for ascending (this.id, that.id)
    // }
}
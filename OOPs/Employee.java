package OOPs;

public class Employee extends Person {
    private String title;
    private char employeeGrade;
    
    public Employee(String name, String email, String phone) {
        super(name, email, phone); // Call the superclass constructor with parameters
    }           

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public String toString() {
        return super.toString() + ", Title: " + title +  ", Employee Grade: " + employeeGrade;
    }

}
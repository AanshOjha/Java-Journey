import java.util.Scanner;

public class GradeChecker { 

        public void assignGrade(int marks) {
            // If marks are less than 0 or greater than 100, return 'X'
            if (marks<0 || marks>100) {
                System.out.println("Your grade is: X");
            }
            // If marks are greater than or equal to 90, return 'A'
            else if (marks>=90) {
                System.out.println("Your grade is: A");
            }
            // If marks are greater than or equal to 80, return 'B'
            else if (marks>=80) {
                System.out.println("Your grade is: B");
            }
            // If marks are greater than or equal to 70, return 'C'
            else if (marks>=70) {
                System.out.println("Your grade is: C");
            }
            // If marks are greater than or equal to 60, return 'D'
            else if (marks>=60) {
                System.out.println("Your grade is: D");
            }
            // If marks are greater than or equal to 50, return 'E'
            else if (marks>=50) {
                System.out.println("Your grade is: E");
            }
            // If marks are less than 50, return 'F'
            else if (marks<50) {
                System.out.println("Your grade is: F");
            }
            // System.out.println("Your grade is: Y");
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks to find your grade.");
        int marks = scanner.nextInt();
        GradeChecker grade = new GradeChecker();
        grade.assignGrade(marks);
        scanner.close();
    }
    
        
}

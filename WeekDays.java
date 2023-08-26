import java.util.Scanner;

public class WeekDays {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.close();

            System.out.println("Enter Day Number: ");
            int dayNo = scanner.nextInt();
            switch (dayNo) {
                case 6, 7 -> System.out.println("It's a Weekend!");
                case 1, 2, 3, 4, 5 -> System.out.println("Yes it's a Week Day!");
                default -> System.out.println("Invalid Input");
            }
        }
    
}

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Result {

    public static String findDay(int day, int month, int year) {
        // Creating a Calendar instance and setting the provided date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Months are 0-based in Calendar, so we subtract 1 from the month

        // Formatting the date to get the day of the week in capital letters
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dateFormat.format(calendar.getTime());

        return dayOfWeek.toUpperCase();
    }

}

public class DayFinderByDate {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a date in DD MM YYYY format: (separate them by space)");
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        String rawInput = scan.nextLine(); // Reads entire line
        String[] firstMultipleInput = rawInput.split(" ");
        
        int day = Integer.parseInt(firstMultipleInput[0]); // Converts String to Integer
        int month = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String result = Result.findDay(day, month, year);

        System.out.printf("\nDay on %d-%d-%d: \n", day, month, year);
        System.out.println(result); // Print the output to the standard output (console)

        scan.close();
    }
}


public class TimeConverter {
    public static void main(String[] args) {}
        public static int convertHoursToMinutes(int hours) {
            // Your task: complete this method
            if (hours <0) {
                return -1;
            }
            else {
                return hours*60;
            }
        }
        
        public static int convertDaysToMinutes(int days) {
            // Your task: complete this method        
            if (days <0) {
                return -1;
            }
            else {
                return days*24*60;
            }
        }
}
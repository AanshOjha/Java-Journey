public class EmployeesWhoMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int noOfEmployees = 0;
        for (int i : hours) {
            if (i >= target) {
                noOfEmployees += 1;
            }
        }
        return noOfEmployees;
    }

    public static void main(String[] args) {
        EmployeesWhoMetTarget emp = new EmployeesWhoMetTarget();
        System.out.println(emp.numberOfEmployeesWhoMetTarget(new int[] {4,12,1,8,9}, 8));
    }
}
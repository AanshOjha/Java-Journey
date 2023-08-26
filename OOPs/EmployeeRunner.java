package OOPs;

public class EmployeeRunner {
        public static void main(String[] args) {
            Employee employee = new Employee("Aansh Ojha", "aanshojha185@gmail.com", "1234567890");
            System.out.println(employee);
            employee.setName("Aansh");
            employee.setEmail("aanshojha185@gmail.com");
            employee.setPhone("1234567890");
            employee.setTitle("Software Engineer");
            employee.setEmployeeGrade('A');
            System.out.println(employee);
        }
}

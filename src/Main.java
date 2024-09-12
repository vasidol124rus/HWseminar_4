import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee(1, "1234567890", "Иван", 5));
        directory.addEmployee(new Employee(2, "9876543210", "Петр", 3));
        directory.addEmployee(new Employee(3, "0123456789", "Мария", 7));

        System.out.println("Сотрудники со стажем 5 лет:");
        List<Employee> employeesWithExperience = directory.findEmployeeByExperience(5);
        for (Employee employee : employeesWithExperience) {
            System.out.println(employee.toString());
        }

        System.out.println("\nНомер телефона Ивана :");
        List<String> phoneNumbers = directory.findPhoneNumberByName("Иван");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        System.out.println("\nСотрудник с табельным номером 2:");
        Employee employeeByTabNumber = directory.findEmployeeByTabNumber(2);
        System.out.println(employeeByTabNumber.toString());
    }
}
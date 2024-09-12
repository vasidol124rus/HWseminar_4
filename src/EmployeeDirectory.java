//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник


import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {

    private final List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();

    }

    public void addEmployee(Employee employee) {
        employees.add(employee);

    }

    public List<Employee> findEmployeeByExperience(int experience) {
        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience)
                foundEmployees.add(employee);

        }
        return foundEmployees;
    }

    public List<String> findPhoneNumberByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name))
                phoneNumbers.add(employee.getPhoneNumber());
        }
        return phoneNumbers;

    }

    public Employee findEmployeeByTabNumber(int tabNumber) {
        for (Employee employee : employees) {
            if (employee.getTabNumber() == tabNumber)
                return employee;
        }
        return null;
    }

}

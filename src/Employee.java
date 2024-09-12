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


public class Employee {

    private final int tabNumber;
    private final String phoneNumber;
    private final String name;
    private final int experience;

    public Employee(int tabNumber, String phoneNumber, String name, int experience) {

        this.tabNumber = tabNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "Табельный номер=" + tabNumber +
                ", номер телефона='" + phoneNumber + '\'' +
                ", Имя='" + name + '\'' +
                ", стаж=" + experience +
                '}';
    }
}

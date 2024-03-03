// Клас "Студент"
public class Student {
    public String firstName;    /* Імʼя студента */
    public String lastName;     /* Прізвище студента */
    int city;                   /* Код міста */
    String phoneNumber;         /* Номер телефону */

    // Конструктор студента з усіма параметрами
    public Student(String firstName, String lastName, int city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setCity(city);
        this.phoneNumber = phoneNumber;
    }

    // Сетер та гетер міста: лише трьохзначні числа
    public void setCity(int city) {
        city = Math.abs(city);
        this.city = city > 999
                ? Integer.parseInt(String.valueOf(city).substring(0, 3))
                : city;
    }
    public int getCity() {
        return city;
    }

    // Метод приведення студента у рядок для виведення з форматуванням
    @Override
    public String toString() {
        return String.format("      %03d | %12s %-12s | %s", city, firstName, lastName, phoneNumber);
    }
}

package DataStructures;

// Клас "Студент"
public class Student {
    public String firstName;    /* Імʼя студента */
    public String lastName;     /* Прізвище студента */
    int course = 1;             /* Курс */
    int cityId = 0;             /* Код міста */
    public boolean hasPhone;    /* Наявність домашнього телефону */
    int backlogsNumber = 0;     /* Кількість академічних заборгованостей — ключ */

    // Конструктор студента з усіма параметрами
    public Student(String firstName, String lastName, int course, int cityId, boolean hasPhone, int backlogsNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setCourse(course);
        this.setCityId(cityId);
        this.hasPhone = hasPhone;
        this.setBacklogsNumber(backlogsNumber);
    }

    // Сетер та гетер для курсу з перевіркою допустимого діапазону значень
    public void setCourse(int course) {
        if (course >= 1 && course <= 6) this.course = course;
    }
    public int getCourse() {
        return course;
    }
    // Сетер та гетер для кількості академічних заборгованостей
    public void setBacklogsNumber(int backlogsNumber) {
        if (backlogsNumber >= 0) this.backlogsNumber = backlogsNumber;
    }
    public int getBacklogsNumber() {
        return backlogsNumber;
    }
    // Сетер та гетер міста: лише тризначні числа
    public void setCityId(int cityId) {
        cityId = Math.abs(cityId);
        this.cityId = cityId > 999
                ? Integer.parseInt(String.valueOf(cityId).substring(0, 3))
                : cityId;
    }
    public int getCityId() {
        return cityId;
    }

    // Метод приведення студента у рядок для виведення з форматуванням
    @Override
    public String toString() {
        return String.format(" %8d | %12s %-12s | %4d | %5d | %s",
                backlogsNumber, firstName, lastName, course, cityId, hasPhone? "є" : "немає");
    }
}

package DataStructures;

/*
 * Клас "Студент"; реалізує інтерфейс для порівняння студентів за номером квитка
 * для спрощення коду додавання до бінарного дерева пошуку.
 */
public class Student implements Comparable<Student> {
    public String firstName;            /* Імʼя */
    public String lastName;             /* Прізвище */
    int course = 1;                     /* Курс */
    String studentCard = "AA00000000";  /* Номер студентського квитка */
    public boolean scholarship;         /* Наявність стипендії */

    // Конструктор Студента з усіма параметрами
    public Student(String firstName, String lastName, int course, String studentCard, boolean scholarship){
        this.firstName = firstName;
        this.lastName = lastName;
        this.setCourse(course);
        this.setStudentCard(studentCard);
        this.scholarship = scholarship;
    }

    // Сетер та гетер для курсу з перевіркою допустимого діапазону значень
    public void setCourse(int course) {
        if (course >= 1 && course <= 6) this.course = course;
    }
    public int getCourse() {
        return this.course;
    }
    /*
     * Сетер та гетер для номера студентського квитка:
     * використовуються регулярні вирази по класам кириличних або латинських літер у кількості двох
     * символів та восьми цифр після них
     */
    public void setStudentCard(String studentCard) {
        if (studentCard.matches("^[\\p{IsCyrillic}\\p{IsLatin}]{2}\\d{8}$"))
            this.studentCard = studentCard;
    }
    public String getStudentCard() {
        return this.studentCard;
    }

    // Метод порівняння двох студентів
    @Override
    public int compareTo(Student other) {
        return this.studentCard.compareTo(other.studentCard);
    }

    // Метод переведення класу у рядок, придатний для виведення
    @Override
    public String toString() {
        return "["+this.studentCard+"] "+this.firstName+" "+this.lastName +
                " | "+this.course+" курс, "+(this.scholarship? "стипендія" : "немає");
    }
}

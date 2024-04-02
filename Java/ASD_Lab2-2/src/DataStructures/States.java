package DataStructures;

// Перелік станів автомата
public enum States {
    Q0("\\^"),
    Q1("[A-Z]"),
    Q2("+\\^"),
    Q3("\\*"),
    Q4("\\^"),
    Q5("[^AZ^\\d]"),
    Q6("+\\^"),
    F("Failure"),
    S("Success");

    // Опис вказує на частину регулярного виразу до даного стану
    public final String description;

    private States(String desc) {
        description = desc;
    }
}

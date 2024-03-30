package DataStructures;

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

    public final String description;

    private States(String desc) {
        description = desc;
    }
}

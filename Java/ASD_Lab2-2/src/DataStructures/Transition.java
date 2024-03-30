package DataStructures;

public class Transition {
    States from;
    Events condition;
    States to;

    public Transition(States from, Events condition, States to) {
        this.from = from;
        this.condition = condition;
        this.to = to;
    }
}

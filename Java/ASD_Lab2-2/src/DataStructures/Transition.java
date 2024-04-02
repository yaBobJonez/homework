package DataStructures;

// Клас, що описує перехід між станами за вхідними даними
public class Transition {
    States from;        /* Початковий стан */
    Events condition;   /* Умова переходу */
    States to;          /* Кінцевий стан */

    public Transition(States from, Events condition, States to) {
        this.from = from;
        this.condition = condition;
        this.to = to;
    }
}

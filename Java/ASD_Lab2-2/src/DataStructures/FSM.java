package DataStructures;

import java.util.ArrayList;

// Скінченний автомат
public class FSM {
    protected States state;                                                 /* Поточний стан */
    ArrayList<Transition> transitions = new ArrayList<>(49);    /* Список переходів */

    // Метод за шаблоном Fluent interface для додавання переходів до автомата
    public FSM with(States from, Events trigger, States to) {
        transitions.add(new Transition(from, trigger, to));
        return this;
    }

    // Метод перевірки, чи є слово правильним, за регулярним виразом, що використовує for
    public boolean match(String input) {
        state = States.Q0;
        for (char c : input.toCharArray()) {
            state = nextState(fireEvent(c));
            if (state == States.S) return true;
            else if (state == States.F) break;
        } return false;
    }
    // Метод визначення події за даним символом (використовує новий синтаксис switch)
    protected Events fireEvent(char c) {
        return switch (c) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> Events.Digit;
            case '^' -> Events.Caret;
            case '*' -> Events.Asterisk;
            case 'A' -> Events.A;
            case 'Z' -> Events.Z;
            default -> (c >= 'B' && c <= 'Y')? Events.BtoY : Events.Etc;
        };
    }
    // Метод обробки переходів за виданою подією
    protected States nextState(Events trigger) {
        for (Transition t : transitions)
            if (t.from == state && t.condition == trigger)
                return t.to;
        return this.state;
    }
}

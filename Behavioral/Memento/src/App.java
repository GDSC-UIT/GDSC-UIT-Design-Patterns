import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //Demo Memento Design Pattern
        //Caretaker
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("First State"); // We don't save first state
        originator.setState("Second State");
        caretaker.addMemento(originator.saveMemento());
        originator.setState("Third State");
        caretaker.addMemento(originator.saveMemento());
        originator.restoreFromMemento(caretaker.getMemento(0)); //should be "Second State"
        originator.restoreFromMemento(caretaker.getMemento(1)); //should be "Third State"
    }
}

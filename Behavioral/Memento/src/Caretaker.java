import java.util.ArrayList;

public class Caretaker {
    ArrayList<Originator.Memento> savedInstances = new ArrayList<>();
    
    public Caretaker() {}
    
    public void addMemento(Originator.Memento memento) {
        savedInstances.add(memento);
    }

    public Originator.Memento getMemento(int index) {
        return savedInstances.get(index) != null ? savedInstances.get(index) : null;
    }

    
}

public class Originator {
    
    private String state;

    public Originator(){

    }

    public Originator(String state){
        this.state = state;
    }

    public void setState(String state){
        this.state = state;
        System.out.println("Originator: Set State = " + state);
    }

    public Memento saveMemento(){
        System.out.println("Originator: Saved " + this.state +" to Memento.");
        return new Memento(state);
    }


    public void restoreFromMemento(Memento memento){
        this.state = memento.getSavedState();
        System.out.println("Originator: Restoring State from Memento with State = " + state);
    }


    public static class Memento {
        private final String state;
 
        public Memento(String stateToSave) {
            state = stateToSave;
        }
 
        public String getSavedState() {
            return state;
        }
    }
    
}

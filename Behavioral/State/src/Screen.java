public class Screen {

    private State state;

    public Screen(){
        this.state = new ActiveState(this);
    }
    
    public State getScreenState(){
        return this.state;
    }

    public void setScreenState(State state){
        this.state = state;
    }
}

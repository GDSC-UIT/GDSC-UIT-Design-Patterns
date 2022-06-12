public class Context {

    private State state;

    public void setState(State state){
        this.state = state;
    }

    public void pause(){
        this.state.onPause();
    }

    public void resume(){
        this.state.onResume();
    }
    
}

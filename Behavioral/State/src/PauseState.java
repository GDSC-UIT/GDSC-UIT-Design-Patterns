public class PauseState implements State {

    private Screen screen;

    public PauseState(Screen screen){
        this.screen = screen;
    }


    @Override
    public void onPause() {
        if(screen.getScreenState() instanceof PauseState) {
            System.out.println("Already Paused");
        }
        else {
            System.out.println("Pausing....");
            screen.setScreenState(new PauseState(this.screen));
        }
    }

    @Override
    public void onResume() {
        if(screen.getScreenState() instanceof ActiveState) {
            System.out.println("Already Active");
        }
        else {
            System.out.println("Resuming...");
            screen.setScreenState(new ActiveState(this.screen));
        }
    }
    
}

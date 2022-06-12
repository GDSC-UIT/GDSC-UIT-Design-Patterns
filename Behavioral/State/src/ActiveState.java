public class ActiveState implements State {

    private Screen screen;

    public ActiveState(Screen screen){
        this.screen = screen;
    }

    @Override
    public void onPause() {
        if(screen.getScreenState() instanceof ActiveState) {
            System.out.println("Pausing....");
            screen.setScreenState(new PauseState(screen));
        }
        else {
            System.out.println("Already Paused");
        }
       
    }

    @Override
    public void onResume() {
        if(screen.getScreenState() instanceof PauseState) {
            System.out.println("Resuming...");
            screen.setScreenState(new ActiveState(screen));
        }
        else {
            System.out.println("Already Active");
        }
    }
    
}

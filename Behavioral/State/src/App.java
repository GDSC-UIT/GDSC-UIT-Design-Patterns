public class App {

    public static int ACTIVE_STATE = 1;
    public static int PAUSE_STATE = 2;
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Screen currentScreen = new Screen(); // initial state is ActiveState
        context.setState(new PauseState(currentScreen));
        context.resume(); // already active so will not change state
        context.pause(); //change to pause state
        context.pause(); // already paused so will not change state
        context.resume(); //change to active state
    }
}

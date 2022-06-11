public class MakeOrder implements Command {
    
    private User user;

    public MakeOrder(User user) {
        this.user = user;
    }

    @Override
    public void execute(Object drinkName) {
        user.order(drinkName.toString());
    }

}

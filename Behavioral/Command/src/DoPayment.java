public class DoPayment implements Command{

    private User user;

    public DoPayment(User user) {
        this.user = user;
    }

    @Override
    public void execute(Object amount) {
        user.pay((double)amount);
        
    }


    
}

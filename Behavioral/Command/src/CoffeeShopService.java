public class CoffeeShopService {

    private Command makeOrderCommand;
    private Command doPaymentCommand;

    public CoffeeShopService(User user) {
        makeOrderCommand = new MakeOrder(user);
        doPaymentCommand = new DoPayment(user);
    }

    public void doOrderAction(String drinkName) {
        System.out.println("User requested order action");
        makeOrderCommand.execute(drinkName);
    }

    public void doPaymentAction(double amount){
        System.out.println("User requested payment action");
        doPaymentCommand.execute(amount);
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("GDSC-UIT");
        CoffeeShopService service = new CoffeeShopService(user);
        service.doOrderAction("Coffee");
        service.doPaymentAction("10.0");
    }
}

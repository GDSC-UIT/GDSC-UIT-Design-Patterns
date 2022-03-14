public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton is creating...");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
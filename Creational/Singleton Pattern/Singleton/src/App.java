public class App {
    public static void main(String[] args) throws Exception {
    //    EagerSingleton instance = EagerSingleton.getInstance();
    //    EagerSingleton anotherInstance = EagerSingleton.getInstance();
    //    System.out.println(instance);
    //    System.out.println(anotherInstance);

        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton anotherInstance = LazySingleton.getInstance();
        System.out.println(instance);
        System.out.println(anotherInstance);
    }
}

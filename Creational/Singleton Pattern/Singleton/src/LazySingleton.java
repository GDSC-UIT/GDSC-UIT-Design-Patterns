
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("LazySingleton is creating...");
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}

import java.util.Scanner;

public class App {
    public static int MOTORBIKE_TYPE = 1;
    public static int PUBLIC_TRANSPORT_TYPE = 2;
    public static void main(String[] args) throws Exception {
        int transportType;
        transportType = App.MOTORBIKE_TYPE; // Edit this to change type :v 
        Context context = new Context();
        if(transportType == App.MOTORBIKE_TYPE){
            context.setStrategy(new MotorbikeStrategy());
        }
        
        if(transportType == App.PUBLIC_TRANSPORT_TYPE){
            context.setStrategy(new PublicTransportStrategy());
        }

        context.executeStrategy(100, 200);

    }

}

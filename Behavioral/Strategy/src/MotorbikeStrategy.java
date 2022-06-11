public class MotorbikeStrategy implements MapStrategy{

    public MotorbikeStrategy(){}

    @Override
    public void findRoute(double latitude, double longitude) {
       System.out.println("Find route for motorbike map for latitude: "
        + latitude + " and longitude: " + longitude);
    }
    
}

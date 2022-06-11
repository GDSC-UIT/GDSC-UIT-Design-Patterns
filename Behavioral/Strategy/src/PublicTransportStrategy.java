public class PublicTransportStrategy implements MapStrategy{

    public PublicTransportStrategy(){}

    @Override
    public void findRoute(double latitude, double longitude) {
        System.out.println("Find route on public transport map for latitude: " 
        + latitude + " and longitude: " + longitude);
    }
    
}

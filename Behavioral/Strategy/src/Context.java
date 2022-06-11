public class Context {

    private MapStrategy mapStrategy;

    public void setStrategy(MapStrategy mapStrategy) {
        this.mapStrategy = mapStrategy;
    }

    public void executeStrategy(double latitude, double longitude){
        mapStrategy.findRoute(latitude, longitude);
    }
    
}

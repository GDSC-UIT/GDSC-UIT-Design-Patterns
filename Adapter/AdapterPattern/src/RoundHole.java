public class RoundHole {
    
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public RoundHole(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isAbleToPlug(RoundShape roundShape) {
        if(this.radius >= roundShape.getRadius()){
            System.out.println("This shape is able to plugging in the hole");
            return true;
        }
        else {
            System.out.println("This shape is unable to plugging in the hole");
            return false;
        }
    }

}

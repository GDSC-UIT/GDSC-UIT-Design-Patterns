public class SquareHoleAdapter extends RoundShape {

    private SquareShape squareShape;

    public SquareHoleAdapter(SquareShape squareShape) {
        this.squareShape = squareShape;
    }

    @Override
    public double getRadius() {
        //r^2 =  2w^2 => r = sqrt(2w^2)
        return (Math.sqrt(Math.pow((squareShape.getWidth() / 2), 2) * 2));
    }

}
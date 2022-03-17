public class App {
    public static void main(String[] args) throws Exception {
        RoundHole roundHole = new RoundHole(10);

        SquareShape bigSquareShape = new SquareShape(14.5);

        SquareHoleAdapter roundHoleAdapter = new SquareHoleAdapter(bigSquareShape);

        roundHole.isAbleToPlug(roundHoleAdapter);
    }
}

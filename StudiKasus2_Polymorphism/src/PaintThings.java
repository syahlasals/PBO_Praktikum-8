import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Shape deck = new Rectangle(20,35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        double deckAmt = paint.amount(deck);
        double bigBallAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\n Number of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(bigBallAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}

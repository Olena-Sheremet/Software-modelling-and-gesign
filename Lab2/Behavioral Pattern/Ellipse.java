public class Ellipse implements Strategy{
    @Override
    public double area(double a, double b) {
        return Math.PI*a*b;
    }
}

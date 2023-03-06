public class Triangle implements Strategy{
    @Override
    public double area(double a, double h) {
        return (a*h)/2;
    }
}

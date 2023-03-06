public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public double executeStrategy(double a, double b){
        return strategy.area(a,b);
    }
}

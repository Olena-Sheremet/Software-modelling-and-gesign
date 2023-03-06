import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Context context=new Context(new Triangle());
        double triangleArea=context.executeStrategy(3.0,4.0);
        Context context1=new Context(new Rectangle());
        double rectangleArea=context1.executeStrategy(3.0,4.0);
        Context context2=new Context(new Ellipse());
        double ellipseArea=context2.executeStrategy(3.0,4.0);
        System.out.println("Triangle Area: " +triangleArea);
        System.out.println("Rectangle Area: " +rectangleArea);
        System.out.println("Ellipse Area: " +ellipseArea);
    }
}
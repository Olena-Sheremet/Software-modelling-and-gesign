public class Main {
    public static void main(String[] args) {

        Car car1=new Car.Builder()
                .brand("BMW")
                .model("M4")
                .yearOfManufacture(2014)
                .maxSpeed(180)
                .color("Black")
                .isAutomaticGrearbox(true)
                .build();
        car1.PrintInfo();
        Car car2=new Car.Builder()
                .brand("Fiat")
                .yearOfManufacture(2003)
                .color("Red")
                .isAutomaticGrearbox(false)
                .build();
        car2.PrintInfo();
    }
}
public class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private int maxSpeed;
    private String color;
    private boolean isAutomaticGearbox;
    public void PrintInfo(){
        System.out.println("Car: "+ brand +" "+model
                +"\nyear: "+ yearOfManufacture
                +"\nmaxSpeed: "+maxSpeed
                +"\nColor: "+ color
                +"\nIsAutomaticGearbox: "+isAutomaticGearbox);
    }
    public static class Builder{
        private Car newCar;
        public Builder(){
            newCar=new Car();
        }
        public Builder brand(String brand){
            newCar.brand=brand;
            return this;
        }
        public Builder model(String model){
            newCar.model=model;
            return this;
        }
        public Builder yearOfManufacture(int yearOfManufacture){
            newCar.yearOfManufacture=yearOfManufacture;
            return this;
        }
        public Builder maxSpeed(int maxSpeed){
            newCar.maxSpeed=maxSpeed;
            return this;
        }
        public Builder color(String color){
            newCar.color=color;
            return this;
        }
        public Builder isAutomaticGrearbox(boolean isAutomaticGrearbox){
            newCar.isAutomaticGearbox=isAutomaticGrearbox;
            return this;
        }
        public Car build(){
            return newCar;
        }
    }
}

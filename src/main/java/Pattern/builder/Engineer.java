package Pattern.builder;

public class Engineer {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car makeCar(String basePlate,String door){
        carBuilder.buildBasePlate(basePlate);
        carBuilder.buildDoor(door);
        return carBuilder.makeCar();
    }
}

package Pattern.builder;

public class CarBuilder extends Builder{

    private Car car = new Car();

    @Override
    public void buildBasePlate(String basePlate) {
        car.setBasePlate(basePlate);
    }

    @Override
    public void buildDoor(String door) {
        car.setDoor(door);
    }

    @Override
    public Car makeCar() {
        return car;
    }
}

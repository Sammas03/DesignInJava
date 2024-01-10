package Pattern.abstractfactory;

public class Car implements CarFactory{
    @Override
    public Cardoor getCarDoor() {
        return new Cardoor();
    }

    @Override
    public CarBasePlate getCarBasePlate() {
        return new CarBasePlate();
    }

    @Override
    public Car make() {
        return null;
    }
}

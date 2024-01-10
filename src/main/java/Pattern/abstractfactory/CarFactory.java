package Pattern.abstractfactory;

public interface CarFactory {

    Cardoor getCarDoor();

    CarBasePlate getCarBasePlate();

    Car make();
}

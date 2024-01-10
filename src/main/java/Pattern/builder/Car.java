package Pattern.builder;

public class Car {

    private String BasePlate;

    private String Door;

    @Override
    public String toString() {
        return "Car{" +
                "BasePlate='" + BasePlate + '\'' +
                ", Door='" + Door + '\'' +
                '}';
    }

    public void setBasePlate(String basePlate) {
        BasePlate = basePlate;
    }

    public void setDoor(String door) {
        Door = door;
    }

    public String getBasePlate() {
        return BasePlate;
    }

    public String getDoor() {
        return Door;
    }
}

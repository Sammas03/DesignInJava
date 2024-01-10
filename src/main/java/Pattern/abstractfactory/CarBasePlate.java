package Pattern.abstractfactory;

public class CarBasePlate extends CarBasePlateFactory{
    @Override
    public void make() {
        System.out.println("制作底盘");
    }
}

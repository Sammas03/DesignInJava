package Pattern.abstractfactory;

public class Cardoor extends CarDoorFactory{
    @Override
    public void make() {
        System.out.println("制作车门");
    }
}

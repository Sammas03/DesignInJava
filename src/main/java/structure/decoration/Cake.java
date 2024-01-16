package structure.decoration;

public class Cake extends AbstractCake{
    @Override
    protected String getInfo() {
        return "煎饼";
    }

    @Override
    protected String cost() {
        return "5块钱";
    }
}

package structure.decoration;

public abstract class CakeDecorator extends AbstractCake{
    private AbstractCake abstractCake;

    public CakeDecorator(AbstractCake abstractCake) {
        this.abstractCake = abstractCake;
    }

    @Override
    protected String getInfo() {
        return abstractCake.getInfo();
    }

    @Override
    protected String cost() {
        return abstractCake.cost();
    }

    protected abstract String Deals();
}

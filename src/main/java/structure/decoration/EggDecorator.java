package structure.decoration;

public class EggDecorator extends CakeDecorator{
    public EggDecorator(AbstractCake abstractCake) {
        super(abstractCake);
    }

    @Override
    protected String getInfo() {
        return super.getInfo()+"加一个鸡蛋";
    }

    @Override
    protected String cost() {
        return super.cost()+"加2块";
    }

    @Override
    protected String Deals() {
        return "打折";
    }
}

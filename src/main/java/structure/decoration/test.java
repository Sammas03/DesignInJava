package structure.decoration;

public class test {
    public static void main(String[] args) {
        AbstractCake abstractCake = new Cake();
        System.out.println(abstractCake.getInfo());
        abstractCake = new EggDecorator(abstractCake);
        System.out.println(abstractCake.getInfo());
    }
}

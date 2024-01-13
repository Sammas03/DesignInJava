package Pattern.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig peki = new Pig();
        peki.setName("peki");
        peki.setDoSomething("玩");
        peki.setAge(11);

        Pig george = (Pig)peki.clone();
        george.setName("george");
        george.setDoSomething("睡觉");
        george.setAge(12);

        System.out.println(peki);
        System.out.println(george);
        System.out.println(peki);
    }
}

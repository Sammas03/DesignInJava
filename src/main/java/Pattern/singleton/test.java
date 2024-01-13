package Pattern.singleton;

public class test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Run());
        Thread t2 = new Thread(new Run());
        t1.start();
        t2.start();
        System.out.println("程序结束了");
    }
}

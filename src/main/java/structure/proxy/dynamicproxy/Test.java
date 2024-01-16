package structure.proxy.dynamicproxy;

public class Test {
    public static void main(String[] args) {
        OrderService proxy = (OrderService) new OrderServiceImplDynamicProxy(new OrderSericeImpl()).bind();
        proxy.saveOrder(new Order());
    }
}

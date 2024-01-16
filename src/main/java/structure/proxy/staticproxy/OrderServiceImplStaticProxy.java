package structure.proxy.staticproxy;

public class OrderServiceImplStaticProxy {
    private OrderService orderService;
    public int saveOrder(Order order){
        orderService = new OrderSericeImpl();
        System.out.println("代理对象执行");
        System.out.println("开启事物");
        int i = orderService.saveOrder(order);
        System.out.println("提交事物");
        return i;

    }
}

package structure.faced;

public class TakingSystem {

    private SelectFoodService selectFoodService;
    private PayService payService;

    private OrderService orderService;

    public TakingSystem() {
        selectFoodService = new SelectFoodService();
        payService = new PayService();
        orderService = new OrderService();
    }

    public void orderTaking(Food food) {

        // 点餐
        selectFoodService.select(food.getName());

        // 校验余额
        boolean flag = payService.checkBalance();
        if (flag) {
            payService.pay();
            orderService.makeOrder();
        }
    }
}

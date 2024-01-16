package structure.proxy.dynamicproxy;

// 业务层
public class OrderSericeImpl implements OrderService {
    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        return orderDao.insert(order) ;
    }
}

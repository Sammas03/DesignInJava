package structure.proxy.staticproxy;

public class OrderDaoImpl implements OrderDao{
    @Override
    public int insert(Order order) {
        System.out.println("信息已保存");
        return 1;
    }
}

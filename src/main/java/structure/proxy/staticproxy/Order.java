package structure.proxy.staticproxy;

public class Order {
    private String info;

    private String userid;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "info='" + info + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}

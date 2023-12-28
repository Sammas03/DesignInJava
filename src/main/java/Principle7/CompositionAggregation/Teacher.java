package Principle7.CompositionAggregation;

public class Teacher {
    private WxNotify wxNotify;

    public void setWxNotify(WxNotify wxNotify) {
        this.wxNotify = wxNotify;
    }

    public void call(){
        wxNotify.WxNotify();
    }
}

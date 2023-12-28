package Principle7.CompositionAggregation;

public class WxNotify implements Notify {

    private Parent parent;
    public void WxNotify(){
        parent.notify();
    }

}

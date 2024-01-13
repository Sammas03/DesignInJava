package Pattern.singleton.doublecheck;

public class DoubleCheck {

    private static DoubleCheck doubleCheck = null;

    private  DoubleCheck(){};

    public static DoubleCheck getInstance(){
        if(doubleCheck == null){
            synchronized (DoubleCheck.class){ // 同步锁
                if(doubleCheck == null){   // 这里也需要有个判断，防止正在等待锁的线程再创建对象
                    doubleCheck = new DoubleCheck();
                }
            }

        }
        return doubleCheck;

    }
}

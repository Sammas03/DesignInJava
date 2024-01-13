package Pattern.singleton.lazy;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //私有化构造器
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(lazySingleton == null)
            lazySingleton = new LazySingleton();

        return  lazySingleton;

    }
}

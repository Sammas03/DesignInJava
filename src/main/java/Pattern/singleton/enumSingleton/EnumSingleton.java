package Pattern.singleton.enumSingleton;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}

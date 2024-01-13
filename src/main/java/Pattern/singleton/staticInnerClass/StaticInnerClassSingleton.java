package Pattern.singleton.staticInnerClass;

public class StaticInnerClassSingleton {

    private static class innerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();


    }

    private StaticInnerClassSingleton() {

    }

    public static StaticInnerClassSingleton getInstance() {
        return innerClass.staticInnerClassSingleton;
    }
}

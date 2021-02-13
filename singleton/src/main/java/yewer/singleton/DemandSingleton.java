package yewer.singleton;

public class DemandSingleton {
    private DemandSingleton() {

    }

    // 静态内部类
    private static class HolderClass {
        private final static DemandSingleton instance = new DemandSingleton();
    }

    public static DemandSingleton getInstance() {
        return HolderClass.instance;
    }

}

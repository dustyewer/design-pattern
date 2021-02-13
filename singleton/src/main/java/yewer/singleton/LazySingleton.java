package yewer.singleton;

public class LazySingleton {
    //双重判断时才需要volatile 修饰符
    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

    // 使用synchronized关键字对方法加锁,确保任意时刻只有一个线程可执行该方法
    //高并发性能低下
    synchronized public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // 双重判断优化
    //性能也不够好
    synchronized public static LazySingleton getInstance_ex() {
        //第一重判断
        if (null == instance) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

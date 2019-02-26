package singleton;

/**
 * 双重校验锁式
 *
 * @author illusoryCloud
 */
public class FourSingleton {
    /**
     * volatile关键字禁止指令重排序
     * 保证多线程下不会获取到未完全初始化的实例
     * 详细请阅读：https://www.lixueduan.com/posts/e7cef119.html
     */
    private static volatile FourSingleton instance;

    private FourSingleton() {
    }

    /**
     * 双重if校验 缩小synchronized代码块范围
     * 若instance不为空 就可直接return
     *
     * @return instance 实例对象
     */
    public static FourSingleton getInstance() {
        if (instance == null) {
            synchronized (FourSingleton.class) {
                if (instance == null) {
                    //非原子操作
                    instance = new FourSingleton();
                }
            }
        }
        return instance;
    }
}

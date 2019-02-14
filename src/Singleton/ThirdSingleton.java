package Singleton;

/**
 * 懒汉式
 *
 * @author illusoryCloud
 */
public class ThirdSingleton {

    private static ThirdSingleton instance;

    private ThirdSingleton() {
    }

    /**
     * synchronized 保证线程安全 但效率低
     *
     * @return
     */
    public synchronized ThirdSingleton getInstance() {
        if (instance == null) {
            instance = new ThirdSingleton();
        }
        return instance;
    }

}

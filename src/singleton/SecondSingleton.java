package singleton;

/**
 * 静态内部类方式
 *
 * @author illusoryCloud
 */
public class SecondSingleton {

    private static class SingletonHolder {
        /**
         * 静态变量类加载时才会被创建 且只会创建一次
         */
        private static final SecondSingleton INSTANCE = new SecondSingleton();
    }

    private SecondSingleton() {
    }

    public static SecondSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

package Singleton;

/**
 *  饿汉式
 * @author illusoryCloud
 */
public class FirstSingleton {
    /**
     * 类变量在类准备阶段就初始化了然后放在<clinit>构造方法中
     * 一旦外部调用了静态方法，那么就会初始化完成。
     * 一个类的<clinit>只会执行一次 保证多线程情况下不会创建多个实例
     */
    private static final FirstSingleton instance=new FirstSingleton();

    /**
     * 构造函数私有化
     */
    private FirstSingleton(){}

    /**
     *  提供公共方法以获取实例对象
     * @return instance 实例对象
     */
    public static FirstSingleton getInstance(){
        return instance;
    }
}

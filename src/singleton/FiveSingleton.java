package singleton;

/**
 * 枚举式
 * 序列化及反序列化安全
 * @author illusoryCloud
 */
public enum FiveSingleton {
    //定义一个枚举的元素，它就是 singleton 的一个实例
    INSTANCE;
    public void doSomeThing(FiveSingleton instance) {
        System.out.println("枚举方式实现单例");
    }

}


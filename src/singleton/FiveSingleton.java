package singleton;

/**
 * 枚举式
 * 序列化及反序列化安全
 * 更多枚举式单例如反序列化安全信息请阅读
 * https://www.lixueduan.com/posts/dff2f393.html
 * @author illusoryCloud
 */
public enum FiveSingleton {
    //定义一个枚举的元素，它就是 singleton 的一个实例
    INSTANCE;
    public void doSomeThing(FiveSingleton instance) {
        System.out.println("枚举方式实现单例");
    }

}


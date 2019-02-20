package proxy.cglibproxy;

/**
 * 被代理类 没有实现接口 无法使用JDK动态代理
 *
 * @author illusoryCloud
 */
public class Dancer {
    public void dance() {
        System.out.println("跳舞者翩翩起舞~");
    }
}

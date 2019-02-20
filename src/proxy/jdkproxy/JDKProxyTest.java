package proxy.jdkproxy;

import org.junit.jupiter.api.Test;
import proxy.staticproxy.Human;
import proxy.staticproxy.Singer;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理 测试类
 *
 * @author illusoryCloud
 */
public class JDKProxyTest {
    @Test
    public void JDKProxyTest() {
        Singer singer = new Singer();
        //参数1：类加载器 参数2：被代理类实现的接口 参数3：回调 由自己实现
        Human human = (Human) Proxy.newProxyInstance(singer.getClass().getClassLoader()
                , singer.getClass().getInterfaces()
                , new MyInvocationHandler(singer));
        human.work();
    }
}

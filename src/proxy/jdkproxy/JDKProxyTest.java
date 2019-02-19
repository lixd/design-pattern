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
        Human human = (Human) Proxy.newProxyInstance(singer.getClass().getClassLoader()
                , singer.getClass().getInterfaces()
                , new MyInvocationHandler(singer));
        human.work();
    }
}

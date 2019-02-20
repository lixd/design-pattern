package proxy.staticproxy;

import org.junit.jupiter.api.Test;

/**
 * 静态代理模式 测试类
 *
 * @author illusoryCloud
 */
public class StaticProxyTest {
    @Test
    public void staticProxyTest() {
        Human singer = new ProxyMan(new Singer());
        singer.work();
    }
}

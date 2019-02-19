package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.Test;
import proxy.staticproxy.Singer;

/**
 * CGLib动态代理 测试类
 *
 * @author illusoryCloud
 */
public class CglibProxyTest {
    @Test
    public void cglibProxyTest(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Dancer.class);
        enhancer.setCallback(new MyMethodInterceptor(new Dancer()));
        Dancer dancer= (Dancer) enhancer.create();
        dancer.work();
    }
}

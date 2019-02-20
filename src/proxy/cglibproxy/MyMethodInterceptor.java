package proxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.staticproxy.Human;

import java.lang.reflect.Method;

/**
 * @author illusoryCloud
 */
public class MyMethodInterceptor implements MethodInterceptor {
    public static final String PROXY_METHOD = "work";

    /**
     * @param o           cglib生成的代理对象
     * @param method      目标对象的方法
     * @param objects     方法入参
     * @param methodProxy 代理方法
     * @return 返回值
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("经纪人为舞蹈演员安排好时间~");
        //注意 这里是invokeSuper  若是invoke则会循环调用最终堆栈溢出
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("经纪人为舞蹈演员联系下一场演出~");
        return o1;

    }
}

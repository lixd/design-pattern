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
    private Human human;

    public MyMethodInterceptor(Human human) {
        this.human = human;
    }

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
        // 判断是否是需要代理的方法
        if (PROXY_METHOD.equals(method.getName())) {
            System.out.println("演唱前烘托气氛~");
            methodProxy.invoke(o, objects);
            System.out.println("演唱后撒花~");
        }
        return methodProxy.invoke(o, objects);

    }
}

package proxy.jdkproxy;

import proxy.staticproxy.Human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author illusoryCloud
 */
public class MyInvocationHandler implements InvocationHandler {
    public static final String PROXY_METHOD = "work";
    private Human human;

    public MyInvocationHandler(Human human) {
        this.human = human;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 判断是否是需要代理的方法
        if (PROXY_METHOD.equals(method.getName())) {
            System.out.println("演唱前烘托气氛~");
            Object invoke = method.invoke(human, args);
            System.out.println("演唱后撒花~");
            return invoke;
        } else {
            return null;
        }
    }
}

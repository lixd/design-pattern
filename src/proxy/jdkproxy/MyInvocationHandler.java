package proxy.jdkproxy;

import proxy.staticproxy.Human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 回调方法
 *
 * @author illusoryCloud
 */
public class MyInvocationHandler implements InvocationHandler {
    public static final String PROXY_METHOD = "work";
    /**
     * 持有一个被代理对象的引用
     */
    private Human human;

    public MyInvocationHandler(Human human) {
        this.human = human;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 判断是否是需要代理的方法
        if (PROXY_METHOD.equals(method.getName())) {
            System.out.println("经纪人为歌手安排好时间~");
            Object invoke = method.invoke(human, args);
            System.out.println("经纪人为歌手联系下一场演出~");
            return invoke;
        } else {
            return null;
        }
    }
}

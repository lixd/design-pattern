package adapter.classadapter;

import org.junit.jupiter.api.Test;

/**
 * 类适配器模式 测试类
 *
 * @author illusoryCloud
 */
public class ClassAdapterTest {
    @Test
    public void classAdapterTest() {
        //Target类型的对象 同时拥有Target()和Adaptee()方法
        Target target = new Adapter();
        //这是目标方法
        target.Target();
        //这是现有的方法
        ((Adapter) target).Adaptee();
    }
}

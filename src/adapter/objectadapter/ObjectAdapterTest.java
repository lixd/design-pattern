package adapter.objectadapter;

import adapter.classadapter.Adaptee;
import adapter.classadapter.Target;
import org.junit.jupiter.api.Test;

/**
 * 对象适配器模式 测试类
 *
 * @author illusoryCloud
 */
public class ObjectAdapterTest {
    @Test
    public void objectAdapterTest() {
        Target target = new Adapter(new Adaptee());
        //这是目标方法
        target.Target();
        //这是现有的方法
        ((Adapter) target).Adaptee();

    }
}

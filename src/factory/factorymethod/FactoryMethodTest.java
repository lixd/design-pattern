package factory.factorymethod;

import factory.easyfactory.Fruit;
import org.junit.jupiter.api.Test;

/**
 * 工厂方法模式 测试类
 *
 * @author illusoryCloud
 */
public class FactoryMethodTest {
    @Test
    public void factoryMethodTest() {
        Fruit apple = new AppleFactory().create();
        apple.show();
        Fruit orange = new OrangeFactory().create();
        orange.show();
    }
}

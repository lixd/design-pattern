package Factory.EasyFactory;

import org.junit.jupiter.api.Test;

/**
 * 简单工厂模式 测试
 *
 * @author illusoryCloud
 *
 */
public class EasyFactoryTest {
    @Test
    public void testEasyFactory() {
        Fruit apple = FruitFactory.creatFruit(FruitFactory.FRUIT_APPLE);
        if (apple != null) {
            apple.show();
        }
        Fruit orange = FruitFactory.creatFruit(FruitFactory.FRUIT_ORANGE);
        if (orange != null) {
            orange.show();
        }
    }
}

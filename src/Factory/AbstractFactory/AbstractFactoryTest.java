package Factory.AbstractFactory;

import Factory.EasyFactory.Fruit;
import org.junit.jupiter.api.Test;

/**
 * 抽象工厂模式 测试类
 *
 * @author illusoryCloud
 */
public class AbstractFactoryTest {
    @Test
    public void abstractFactoryTest() {
        //苹果产品簇
        AbstractFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.createFruit();
        Juice appleJuice = appleFactory.createJuice();
        //橘子产品簇
        AbstractFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.createFruit();
        Juice orangeJuice = orangeFactory.createJuice();

        apple.show();
        appleJuice.show();
        orange.show();
        orangeJuice.show();
    }

}

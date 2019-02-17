package Factory.AbstractFactory;

import Factory.EasyFactory.Apple;
import Factory.EasyFactory.Fruit;
import Factory.EasyFactory.Orange;

/**
 * 具体工厂类
 * 橘子工厂 生产橘子和橘子汁
 *
 * @author illusoryCloud
 */
public class OrangeFactory implements AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Orange();
    }

    @Override
    public Juice createJuice() {
        return new OrangeJuice();
    }
}

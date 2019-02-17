package Factory.FactoryMethod;

import Factory.EasyFactory.Fruit;
import Factory.EasyFactory.Orange;

/**
 * 具体产品工厂 实现接口
 * 橘子工厂
 *
 * @author illusoryCloud
 */
public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit create() {
        return new Orange();
    }
}

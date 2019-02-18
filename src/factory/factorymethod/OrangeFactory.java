package factory.factorymethod;

import factory.easyfactory.Fruit;
import factory.easyfactory.Orange;

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

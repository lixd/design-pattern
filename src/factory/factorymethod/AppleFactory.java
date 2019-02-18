package factory.factorymethod;

import factory.easyfactory.Apple;
import factory.easyfactory.Fruit;

/**
 * 具体产品工厂 实现接口
 * 苹果工厂
 * @author illusoryCloud
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit create() {
        return new Apple();
    }
}

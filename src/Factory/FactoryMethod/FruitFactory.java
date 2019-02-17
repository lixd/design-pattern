package Factory.FactoryMethod;

import Factory.EasyFactory.Fruit;

/**
 *  抽象产品工厂类
 * @author illusoryCloud
 */
public interface FruitFactory {
    Fruit create();
}

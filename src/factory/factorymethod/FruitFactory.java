package factory.factorymethod;

import factory.easyfactory.Fruit;

/**
 *  抽象产品工厂类
 * @author illusoryCloud
 */
public interface FruitFactory {
    Fruit create();
}

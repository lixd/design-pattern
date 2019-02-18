package factory.abstractfactory;

import factory.easyfactory.Fruit;
import factory.easyfactory.Orange;

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

package factory.abstractfactory;

import factory.easyfactory.Apple;
import factory.easyfactory.Fruit;

/**
 * 具体工厂类
 * 苹果工厂 生产苹果和苹果汁
 *
 * @author illusoryCloud
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Juice createJuice() {
        return new AppleJuice();
    }
}

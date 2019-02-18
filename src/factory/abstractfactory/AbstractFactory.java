package factory.abstractfactory;

import factory.easyfactory.Fruit;

/**
 * 抽象工厂类
 *
 * @author illusoryCloud
 */
public interface AbstractFactory {
    /**
     * 创建水果
     *
     * @return 水果
     */
    Fruit createFruit();

    /**
     * 创建果汁
     *
     * @return 果汁
     */
    Juice createJuice();
}

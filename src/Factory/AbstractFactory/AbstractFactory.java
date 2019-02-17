package Factory.AbstractFactory;

import Factory.EasyFactory.Fruit;

/**抽象工厂类
 * @author illusoryCloud
 */
public interface AbstractFactory {
    Fruit createFruit();
    Juice createJuice();
}

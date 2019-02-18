package factory.easyfactory;

/**
 * 工厂类   水果工厂
 * 负责生产各种产品
 *
 * @author illusoryCloud
 */
public class FruitFactory {
    public static final String FRUIT_APPLE = "Apple";
    public static final String FRUIT_ORANGE = "Orange";

    public static Fruit creatFruit(String fruit) {
        if (FRUIT_APPLE.equals(fruit)) {
            return new Apple();
        } else if (FRUIT_ORANGE.equals(fruit)) {
            return new Orange();
        } else {
            System.out.println("error unknown fruit ~");
            return null;
        }
    }
}

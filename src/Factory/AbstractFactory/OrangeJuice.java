package Factory.AbstractFactory;

/**
 * 具体产品类
 * 橘子汁
 *
 * @author illusoryCloud
 */
public class OrangeJuice implements Juice {
    @Override
    public void show() {
        System.out.println("OrangeJuice");
    }
}

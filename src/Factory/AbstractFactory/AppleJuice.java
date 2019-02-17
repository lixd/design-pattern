package Factory.AbstractFactory;

/**
 * 具体产品类
 * 苹果汁
 *
 * @author illusoryCloud
 */
public class AppleJuice implements Juice {
    @Override
    public void show() {
        System.out.println("AppleJuice");
    }
}

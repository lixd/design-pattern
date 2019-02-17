package Factory.EasyFactory;

/**
 * 具体产品类
 * 苹果  实现了水果接口
 * @author illusoryCloud
 */
public class Apple implements Fruit {
    @Override
    public void show() {
        System.out.println("This is Apple");
    }
}

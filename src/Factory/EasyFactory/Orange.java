package Factory.EasyFactory;

/**
 * 具体产品类
 * 橘子 实现了水果接口
 * @author illusoryCloud
 */
public class Orange implements Fruit {
    @Override
    public void show() {
        System.out.println("This is Orange");
    }
}

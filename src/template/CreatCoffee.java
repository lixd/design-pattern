package template;

/**
 * 具体模板角色
 * 咖啡
 *
 * @author illusoryCloud
 */
public class CreatCoffee extends BaseCreatDrink {
    @Override
    public void brew() {
        System.out.println("冲咖啡~");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖~");
    }
}

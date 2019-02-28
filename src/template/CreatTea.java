package template;

/**
 * 具体模板角色
 * 茶
 *
 * @author illusoryCloud
 */
public class CreatTea extends BaseCreatDrink {
    @Override
    public void brew() {
        System.out.println("泡茶~");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬~");
    }
}

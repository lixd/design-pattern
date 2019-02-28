package template;

/**
 * 具体模板角色
 * 纯茶
 *
 * @author illusoryCloud
 */
public class CreatPureTea extends BaseCreatDrink {
    @Override
    public void brew() {
        System.out.println("泡茶~");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬~");
    }

    /**
     * 通过重写钩子方法来改变算法
     * 返回true则添加调味品
     * 返回false则不加
     * 默认为true
     *
     * @return isNeedCondiments
     */
    @Override
    public boolean isNeedCondiments() {
        return false;
    }
}

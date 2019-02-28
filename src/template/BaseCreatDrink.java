package template;

/**
 * 模板方法模式
 * 抽象模板角色
 *
 * @author illusoryCloud
 */
public abstract class BaseCreatDrink {
    /**
     * 按顺序调用其他方法
     */
    public void doCreate() {
        boilWater();
        brew();
        pourInCup();
        if (isNeedCondiments())
        {
            addCondiments();
        }
    }

    /**
     * 烧开水
     * 通用的方法 直接实现
     */
    private void boilWater() {
        System.out.println("烧开水~");
    }

    /**
     * 特殊操作，在子类中具体实现
     */
    public abstract void brew();


    /**
     * 倒入杯中
     * 通用的方法 直接实现
     */
    private void pourInCup() {
        System.out.println("倒入杯中~");
    }

    /**
     * 添加调味品 茶里面加柠檬 咖啡中加糖等等
     * 特殊操作
     * 具体由子类实现
     */
    public abstract void addCondiments();

    /**
     * 钩子方法，决定某些算法步骤是否挂钩在算法中
     * 子类可以重写该类来改变算法或者逻辑
     */
    public boolean isNeedCondiments() {
        return true;
    }
}

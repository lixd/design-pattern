package decorator;

/**
 * 抽象装饰角色
 *
 * @author illusoryCloud
 */
public class Decorator implements Human {
    /**
     * 持有一个具体构件的引用
     */
    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void run() {
        human.run();
    }
}

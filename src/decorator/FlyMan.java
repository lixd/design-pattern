package decorator;

/**
 * 具体装饰角色
 * 飞人
 *
 * @author illusoryCloud
 */
public class FlyMan extends Decorator {
    public FlyMan(Human human) {
        super(human);
    }

    @Override
    public void run() {
        super.run();
        this.fly();
    }

    /**
     * 扩展功能
     */
    private void fly() {
        System.out.println("变成飞人了，速度加快了~");
    }
}

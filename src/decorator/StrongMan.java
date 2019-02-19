package decorator;

/**
 * 具体装饰角色
 * 强壮的男人
 *
 * @author illusoryCloud
 */
public class StrongMan extends Decorator {

    public StrongMan(Human human) {
        super(human);
    }

    @Override
    public void run() {
        super.run();
        this.strong();
    }

    public void strong() {
        System.out.println("变得强壮了，耐力提升了~");
    }
}

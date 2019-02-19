package decorator;

/**
 * 具体构件角色
 * 男人
 *
 * @author illusoryCloud
 */
public class Man implements Human {
    @Override
    public void run() {
        System.out.println("男人在跑");
    }
}

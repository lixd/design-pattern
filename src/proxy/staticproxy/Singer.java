package proxy.staticproxy;

/**
 * 目标对象角色
 *
 * @author illusoryCloud
 */
public class Singer implements Human {
    @Override
    public void work() {
        System.out.println("歌手在唱歌~");
    }
}

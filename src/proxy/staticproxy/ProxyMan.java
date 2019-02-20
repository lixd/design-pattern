package proxy.staticproxy;

/**
 * 代理对象角色
 *
 * @author illusoryCloud
 */
public class ProxyMan implements Human {
    /**
     * 持有目标对象的引用
     */
    private Human human;

    /**
     * 通过构造方法注入
     *
     * @param human 目标对象
     */
    public ProxyMan(Human human) {
        this.human = human;
    }

    @Override
    public void work() {
        System.out.println("经纪人为歌手安排好时间~");
        human.work();
        System.out.println("经纪人为歌手联系下一场演出~");
    }
}

package flyweight.pure;

/**
 * 单纯享元模式 具体享元角色
 * 内蕴状态为type 即球的类型 由构造方法传入
 * 外蕴状态为color 即球的颜色 作为show()方法的参数传入
 *
 * @author illusoryCloud
 */
public class ConcreteBall implements Ball {
    private String type;

    public ConcreteBall(String type) {
        this.type = type;
    }

    @Override
    public void show(String color) {
        System.out.println("这是一个：" + color + "的" + type);
    }
}

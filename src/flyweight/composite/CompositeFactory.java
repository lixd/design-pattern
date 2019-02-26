package flyweight.composite;

import flyweight.pure.Ball;
import flyweight.pure.ConcreteBall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 复合享元模式 复合工厂角色
 *
 * @author illusoryCloud
 */
public class CompositeFactory {
    private Map<String, Ball> factory = new HashMap<String, Ball>();

    /**
     * 获取复合享元
     *
     * @param types 类型集合
     * @return 复合享元对象 包含多个单纯享元对象
     */
    public Ball getComposite(List<String> types) {
        CompositeBall composteBall = new CompositeBall();

        for (String type : types) {
            composteBall.add(type, getPure(type));
        }

        return composteBall;
    }

    /**
     * 获取单纯享元角色
     *
     * @param type 内蕴状态
     * @return 具体享元角色
     */
    public Ball getPure(String type) {
        Ball ball = factory.get(type);
        if (ball == null) {
            //如果对象不存在则创建一个新的对象
            ball = new ConcreteBall(type);
            //把这个新的Flyweight对象添加到缓存中
            factory.put(type, ball);
        }
        return ball;
    }

    /**
     * 静态内部类 单例模式
     */
    private CompositeFactory() {
    }

    private static class SingletonHolder {
        private static final CompositeFactory INSTANCE = new CompositeFactory();
    }

    public static CompositeFactory getInstance() {
        return CompositeFactory.SingletonHolder.INSTANCE;
    }
}

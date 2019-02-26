package flyweight.pure;

import java.util.HashMap;
import java.util.Map;

/**
 * 单纯享元模式 享元工厂角色
 *
 * @author illusoryCloud
 */
public class BallFactory {
    /**
     * 将对象存在map中
     */
    private static Map<String, Ball> factory = new HashMap<>();

    /**
     * 获取单纯享元角色
     *
     * @param type 内蕴状态
     * @return 具体享元角色
     */
    public Ball getBall(String type) {
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
    private BallFactory() {
    }

    private static class SingletonHolder {
        private static final BallFactory INSTANCE = new BallFactory();
    }

    public  static BallFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

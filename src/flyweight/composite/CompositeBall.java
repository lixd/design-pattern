package flyweight.composite;

import flyweight.pure.Ball;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 复合享元模式 复合享元角色
 *
 * @author illusoryCloud
 */
public class CompositeBall implements Ball {
    /**
     * 复合享元角色内部包含多个单纯享元角色
     */
    private Map<String, Ball> composite = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到集合中
     */
    public void add(String type, Ball ball) {
        composite.put(type, ball);
    }

    /**
     * 遍历的方式挨个调用内部单纯享元角色的show方法
     *
     * @param color 外蕴状态
     */
    @Override
    public void show(String color) {
        Set<String> strings = composite.keySet();
        for (String type : strings) {
            Ball ball = composite.get(type);
            ball.show(color);
        }
    }
}

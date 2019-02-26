package flyweight.pure;

/**
 * 单纯享元模式 抽象享元角色
 *
 * @author illusoryCloud
 */
public interface Ball {
    /**
     * 简单的show方法
     * 根据传入的参数(外蕴状态)不同而产生不同的表现
     *
     * @param color 外蕴状态
     */
    void show(String color);
}

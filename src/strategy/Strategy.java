package strategy;

/**
 * 策略模式 抽象策略角色
 * 定义一个两个整数间的计算方法
 *
 * @author illusoryCloud
 */
public interface Strategy {
    /**
     * 两个整数间的计算方法
     *
     * @param a
     * @param b
     * @return
     */
    int calculate(int a, int b);
}

package strategy;

/**
 * 策略模式 具体策略角色
 * 减法
 *
 * @author illusoryCloud
 */
public class SubtractionStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

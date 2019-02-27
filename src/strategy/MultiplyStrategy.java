package strategy;

/**
 * 策略模式 具体策略角色
 * 乘法
 *
 * @author illusoryCloud
 */
public class MultiplyStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}

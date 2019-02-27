package strategy;

/**
 * 策略模式 具体策略角色
 * 除法
 *
 * @author illusoryCloud
 */
public class DivisionStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new RuntimeException("除数不能为零");
        }

    }
}

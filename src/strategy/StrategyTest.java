package strategy;

import org.junit.jupiter.api.Test;

/**
 * 策略模式 测试类
 *
 * @author illusoryCloud
 */
public class StrategyTest {
    @Test
    public void strategyTest() {

        //加法
        Context context = new Context(new AddStrategy());
        System.out.println(context.calculate(5, 5));
        //减法
        Context context2 = new Context(new SubtractionStrategy());
        System.out.println(context2.calculate(5, 5));
        //乘法
        Context context3 = new Context(new MultiplyStrategy());
        System.out.println(context3.calculate(5, 5));
        //除法
        Context context4 = new Context(new DivisionStrategy());
        System.out.println(context4.calculate(5, 5));
    }
}

package strategy;

/**
 * 策略模式 环境角色
 *
 * @author illusoryCloud
 */
public class Context {
    /**
     * 持有Strategy的引用
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }


    public Strategy getStrategy() {
        return strategy;
    }

    /**
     * set方法可以完成策略更换
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }
}

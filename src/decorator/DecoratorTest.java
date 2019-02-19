package decorator;

import org.junit.jupiter.api.Test;

/**
 * 装饰者模式 测试类
 *
 * @author illusoryCloud
 */
public class DecoratorTest {
    @Test
    public void decoratorTest() {
        Human man = new Man();
        man.run();
        System.out.println("--------------------");
        Human flyMan = new FlyMan(man);
        flyMan.run();
        System.out.println("--------------------");
        Human weakMan = new StrongMan(man);
        weakMan.run();
    }

}

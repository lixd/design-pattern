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
        //普通对象
        Human man = new Man();
        man.run();
        System.out.println("--------------------");
        //装饰后的对象
        Human flyMan = new FlyMan(man);
        flyMan.run();
        System.out.println("--------------------");
        //装饰后的对象
        Human strongMan = new StrongMan(man);
        strongMan.run();
        System.out.println("--------------------");
        //装饰后的对象再次装饰
        Human strongFlyMan = new StrongMan(flyMan);
        strongFlyMan.run();


    }

}

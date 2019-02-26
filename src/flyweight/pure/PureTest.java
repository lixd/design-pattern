package flyweight.pure;

import org.junit.jupiter.api.Test;

/**
 * 单纯享元模式 测试类
 *
 * @author illusoryCloud
 */
public class PureTest {
    /**
     * 当客户端需要单纯享元对象的时候，需要调用享元工厂的factory()方法，
     * 并传入所需的单纯享元对象的内蕴状态，由工厂方法产生所需要的享元对象。
     */
    @Test
    public void flyWeightTest() {
        BallFactory ballFactory = BallFactory.getInstance();
        Ball basketball = ballFactory.getBall("篮球");
        Ball football = ballFactory.getBall("足球");
        basketball.show("红色");
        basketball.show("黄色");
        football.show("黑色");
        football.show("白色");
        Ball basketball2 = ballFactory.getBall("篮球");
        Ball football2 = ballFactory.getBall("足球");
        //true 都是同一个对象
        System.out.println(basketball.equals(basketball2));
        //true
        System.out.println(football.equals(football2));

    }
}

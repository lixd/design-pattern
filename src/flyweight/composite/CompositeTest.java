package flyweight.composite;

import flyweight.pure.Ball;
import flyweight.pure.BallFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 单纯享元模式 测试类
 *
 * @author illusoryCloud
 */
public class CompositeTest {
    /**
     * 当客户端需要单纯享元对象的时候，需要调用享元工厂的factory()方法，
     * 并传入所需的单纯享元对象的内蕴状态，由工厂方法产生所需要的享元对象。
     */
    @Test
    public void flyWeightTest() {
        CompositeFactory compositeFactory = CompositeFactory.getInstance();
        Ball pure = compositeFactory.getPure("篮球");
        Ball pure2 = compositeFactory.getPure("篮球");
        pure.show("红色");
        List<String> types = Arrays.asList("篮球", "足球", "排球");
        Ball composite = compositeFactory.getComposite(types);
        Ball composite2 = compositeFactory.getComposite(types);
        composite.show("蓝色");
        //false 复合享元角色不相同
        System.out.println(composite.equals(composite2));
        //true 单纯享元角色相同
        System.out.println(pure.equals(pure2));
    }
}

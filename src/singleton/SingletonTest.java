package singleton;

import org.junit.jupiter.api.Test;

/**
 * 单例模式测试类
 *
 * @author illusoryCloud
 */
public class SingletonTest {
    @Test
    public void singletonTest() {
        FirstSingleton instance = FirstSingleton.getInstance();
        SecondSingleton instance1 = SecondSingleton.getInstance();
        ThirdSingleton instance2 = ThirdSingleton.getInstance();
        FourSingleton instance3 = FourSingleton.getInstance();
        FiveSingleton instance4 = FiveSingleton.INSTANCE;
    }
}

package facade;

import org.junit.jupiter.api.Test;

/**
 * 外观模式 测试类
 *
 * @author illusoryCloud
 */
public class FacadeTest {
    @Test
    public void facedeTest() {
        Computer computer = new Computer();
        computer.startUp();
        System.out.println("------------------");
        computer.shutDown();
    }

}

package builder.first;

/**
 * 建造者模式 测试类
 *
 * @author illusoryCloud
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void testBuilder() {
        Message commonMessage = new Dreator().createMessage(new CommonMessageBuilder());
        Message othersMessage = new Dreator().createMessage(new OthersMessageBuilder());
        System.out.println(commonMessage);
        System.out.println(othersMessage);
    }
}

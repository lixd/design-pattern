package builder.second;

import java.util.Date;

/**
 * 建造者模式 测试类
 *
 * @author illusoryCloud
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void testBuilder() {
        Message build = Message.newBuilder().setTitle("这是消息标题")
                .setContent("这是消息内容")
                .setFrom("这是消息发送者")
                .setTo("这是消息接收者")
                .setTime(new Date())
                .Build();
        System.out.println(build.toString());
    }
}

package Builder.Second;

import java.util.Date;

public class Test {
    @org.junit.jupiter.api.Test
    private void testBuilder(){
        Message build = new Message.Builder().setTitle("这是消息标题")
                .setContent("这是消息内容")
                .setFrom("这是消息发送者")
                .setTo("这是消息接收者")
                .setTime(new Date())
                .Build();
        System.out.println(build.toString());
    }
}

package builder.first;

import java.util.Date;

/**
 * 具体的建造对象类 实现了Builder接口
 * 可以根据不同需求有不同的实现
 * @author illusoryCloud
 */
public class CommonMessageBuilder implements Builder {
    private Message message;

    public CommonMessageBuilder() {
        this.message = new Message();
    }

    @Override
    public void setTitle() {
        message.setTitle("常见的标题");
    }

    @Override
    public void setContent() {
        message.setContent("普通的内容");
    }

    @Override
    public void setFrom() {
        message.setFrom("未知的发送者");
    }

    @Override
    public void setTo() {
        message.setTo("未知的接收者");
    }

    @Override
    public void setTime() {
        message.setTime(new Date());
    }

    @Override
    public Message build() {
        return this.message;
    }
}

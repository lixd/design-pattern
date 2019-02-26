package builder.second;

import java.util.Date;

/**
 * 构建的消息对象
 * 有个静态内部类
 *
 * @author illusoryCloud
 */
public class Message {
    /**
     * 标题
     */
    private String Title;
    /**
     * 内容
     */
    private String Content;
    /**
     * 发送者
     */
    private String From;
    /**
     * 接收者
     */
    private String To;
    /**
     * 时间
     */
    private Date Time;


    @Override
    public String toString() {
        return "Message{" +
                "Title='" + Title + '\'' +
                ", Content='" + Content + '\'' +
                ", From='" + From + '\'' +
                ", To='" + To + '\'' +
                ", Time=" + Time +
                '}';
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * 静态内部类 builder
     */
    public static class Builder {
        //设置默认值
        private String Title = "未命名";
        private String Content = "暂无内容";
        private String From = "unknow";
        private String To = "unknow";
        private Date Time = new Date();

        /**
         * 设置消息标题
         *
         * @param title 要设置的标题
         * @return 返回Builder对象 以达到链式调用
         */
        public Builder setTitle(String title) {
            this.Title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.Content = content;
            return this;
        }

        public Builder setFrom(String from) {
            this.From = from;
            return this;
        }

        public Builder setTo(String to) {
            this.To = to;
            return this;
        }

        public Builder setTime(Date time) {
            this.Time = time;
            return this;
        }

        public Message Build() {
            Message message = new Message();
            message.Title = Title;
            message.Content = Content;
            message.From = From;
            message.To = To;
            message.Time = Time;
            return message;
        }

    }
}

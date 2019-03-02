package observer;

/**
 * 构建的消息对象
 *
 * @author illusoryCloud
 */
public class Message {
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * 静态内部类 builder
     */
    public static class Builder {
        /**
         * 设置默认值
         */
        private String title = "未命名";
        private String content = "暂无内容";

        /**
         * 设置消息标题
         *
         * @param title 要设置的标题
         * @return 返回Builder对象 以达到链式调用
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }


        public Message build() {
            Message message = new Message();
            message.title = title;
            message.content = content;
            return message;
        }

    }
}

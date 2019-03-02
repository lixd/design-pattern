package builder.first;

/** 指导者
 * 只负责保证对象各部分完整创建
 * @author illusoryCloud
 */
public class Dreator {
    /**
     *
     * @param builder 参数是只要实现了Builder接口的类都可以
     * @return
     */
    public Message createMessage(Builder builder) {
        builder.setTitle();
        builder.setContent();
        builder.setFrom();
        builder.setTo();
        builder.setTime();
        return builder.build();
    }
}

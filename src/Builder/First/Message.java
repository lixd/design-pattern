package Builder.First;

import java.util.Date;

/**
 * 构建的消息对象
 * 普通对象
 *
 * @author illusoryCloud
 */
public class Message {
    /** 标题 */
    private String Title;
    /** 内容 */
    private String Content;
    /** 发送者 */
    private String From;
    /** 接收者 */
    private String To;
    /** 时间 */
    private Date Time;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

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
}
package prototype;

import java.io.*;
import java.util.Date;

/**
 * 构建的消息对象
 * 普通对象
 *
 * @author illusoryCloud
 */
public class Message implements Serializable, Cloneable {
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
    private User From;
    /**
     * 接收者
     */
    private User To;
    /**
     * 时间
     */
    private Date Time;

    /**
     * 浅克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 深克隆
     *
     * @return Message对象
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Message deepClone() throws IOException, ClassNotFoundException {
        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 读出二进制流产生的新对象

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Message) ois.readObject();
    }

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

    public User getFrom() {
        return From;
    }

    public void setFrom(User from) {
        From = from;
    }

    public User getTo() {
        return To;
    }

    public void setTo(User to) {
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
                ", From=" + From +
                ", To=" + To +
                ", Time=" + Time +
                '}';
    }

}
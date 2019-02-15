package Builder.First;

/**
 * Builder接口 建造对象的标准
 */
public interface Builder {
    void setTitle();
    void setContent();
    void setFrom();
    void setTo();
    void setTime();
    Message build();
}
